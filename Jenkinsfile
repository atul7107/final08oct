#!groovy

@Library('github.com/atul7107/final08oct')_

node {
	stage 'Checkout and Setup'
		checkout scm
	stage 'beta'
		sh 'fastlane feature'
}
