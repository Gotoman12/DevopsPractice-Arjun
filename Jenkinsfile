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
        stage("Parallel-Deployment") {  // Added name
            parallel{
                stage("Application hosted") {  // Proper nested stage
                    steps {  // Block syntax, not steps("...")
                        sh '''
                        echo "application is deployed"
                        '''
                    }
                }
                stage("Another parallel task") {  // Optional second branch
                    steps {
                        sh '''
                        echo "running notifications"
                        '''
                    }
                }
            }
        }
    }
}
