#!groovy

library "github.com/atul7107/final08oct@feature-fastlane"

node {
	stage "Checkout" {
		// some block
	}
		checkout scm
	stage 'increment'
		sh 'fastlane feature'
	stage 'build'
	        sh 'fastlane build'
	stage 'unit test'
	        sh 'fastlane unittest'
	stage  'screenshot'
	        sh 'fastlane screenshot'
}
