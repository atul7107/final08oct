#!groovy

node 
      {
    stage ("Checkout")  
        checkout scm
           
    stage ("increment") 
        sh 'bundle exec fastlane feature'
           
    stage ("build")  
            sh 'bundle exec fastlane build'
          
    stage ("unit test") 
            sh 'bundle exec fastlane unittest'
                  
    stage ("code Coverage") 
            sh 'bundle exec fastlane codecoverage'
          
    stage  ("screenshot") 
            sh 'bundle exec fastlane screenshot'
  }
  
