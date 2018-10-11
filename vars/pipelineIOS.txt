#!/usr/bin/groovy
 
def call(body) {
    // evaluate the body block, and collect configuration into the object
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()
 
    def agent = config.agent ?: 'ios'
 
 
    // now build, based on the configuration provided
    node(agent) {
 
    def workspace = pwd()
 
    def pipeline = new cz.ackee.Pipeline()
 
    config.pipelineType = 'ios'
 
    println "pipeline config from Jenkinsfile ==> ${config}"
 
    pipeline.setEnv(config)
    println "flattened pipeline config ==> ${config}"
 
    env.FASTLANE_SKIP_UPDATE_CHECK = 1
    env.FASTLANE_DISABLE_COLORS = 1
    env.CHANGELOG_PATH = "outputs/changelog.txt"
    def slackChannel = config.slackChannel ?: 'ci-ios' // don't care if it exists
 
    def reason = 'start'
 
    try {
 
        properties([
            disableConcurrentBuilds(),
        ])
 
        stage('Checkout') {
            reason = 'checkout'
            // Checkout code from repository and update any submodules
            pipeline.checkoutScm()
            sh "mkdir -p outputs"
 
            // generate changelog
            pipeline.generateChangelog path: env.CHANGELOG_PATH, format: 'format:- %s [%ce]'
        }
      currentBuild.result = 'SUCCESS'
    } catch (e) {
        currentBuild.result = 'FAILURE'
        throw e
    } finally {
        pipeline.notifySlack(channel: slackChannel, reason: reason)
    }
    }
}
