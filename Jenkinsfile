#!groovy

@Library('github.com/atul7107/final08oct') _feature-fastlane

node {
	stage 'Checkout and Setup'
		checkout scm
	stage 'beta'
		sh 'fastlane feature'
}
