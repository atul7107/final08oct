node {
	stage 'Checkout and Setup'
		checkout scm
	stage 'beta'
		sh 'fastlane beta'
#	stage 'Test'
#		sh 'fastlane test'
#	stage 'Build'
#		def build_number = env.BUILD_NUMBER
#		sh "fastlane build build_number:${build_number}"
#	stage 'Deploy'
#		archive 'reports/, dist/'
#		sh 'fastlane deploy'
}
