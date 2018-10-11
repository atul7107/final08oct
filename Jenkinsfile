#!groovy

library "github.com/atul7107/final08oct@feature-fastlane" 
      
    stages {
        stage('Checkout') {
            steps {
                sh 'scm checkout'
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
            steps {
                sh 'fastlane unittest'
            }
        }
        stage('screenshot') {
            steps {
                sh 'fastlane screenshot'
            }
        }    
   
    }
    
  }
