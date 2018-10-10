#!groovy

@Library('github.com/red-panda-ci/jenkins-pipeline-library') _

node {
	stage 'Checkout and Setup'
		checkout scm
	stage 'beta'
		sh 'fastlane feature'
}
