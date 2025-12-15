pipeline{
    agent any
    stages{
        stage("GIT-CHECKOUT"){
            steps{
                git url:"https://github.com/Gotoman12/DevopsPractice-Arjun.git", branch:"dev"
            }
        }
         stage("Checkout-successfully"){
            steps{
                sh '''
                echo "git workspace is created"
                '''
            }
        }
         stage("Build-stage"){
            steps{
                sh '''
                echo "Build is successful"
                '''
            }
        }
          stage("Test-stage"){
            steps{
                sh '''
                echo "Test is successful"
                '''
            }
        }
         stage("Package-stage"){
            steps{
                sh '''
                echo "Package is successful"
                '''
            }
        }
         stage("deploy-stage"){
            steps{
                sh '''
                echo "deploy is successful"
                '''
            }
        }
        stage{
            parallel{
                stage{
                    steps("Application hosted"){
                        sh '''
                           echo "application is deployed"
                        '''
                    }
                }
				stage{
                    steps("Another parallel task"){
                        sh '''
                           echo "running notifications"
                        '''
                    }
                }
            }
        }
    }
}