#!groovy

library "github.com/atul7107/final08oct@feature-fastlane1"

node 
      {
    stage ("Checkout")  
        checkout scm
           
    stage ("increment") 
        sh 'fastlane feature'
           
    stage ("build")  
            sh 'fastlane build'
          
    stage ("unit test") 
            sh 'fastlane unittest'
                  
    stage ("codecoverage") 
            sh 'fastlane sonar'
          
    stage  ("screenshot") 
            sh 'fastlane screenshot'
  }
  
