def call() {

  stages {
    stage('Checkout') {
      steps {
        checkout scm
      }
    }

    stage('increment') {
      steps {
        sh 'fastlane feature'
      }
    }

    stage('build') {
      steps {
        sh 'fastlane build'
       }
     } 

    stage('unit test') {
      when {
        expression {
          env.BRANCH_NAME == 'develop'
        }
      }
      steps {
        // Generating docs
        sh 'fastlane unittest'
      }
    }
  }
 }
}
