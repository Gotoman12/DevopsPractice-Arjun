pipeline{
    agent any
    parameters {
        string(name:'ENV', defaultValue:"main",description:"This is my first parameter")
    }
    stages {
        stage('Build-Stage') {
            stages {
                stage('checking_code') {
                    steps {
                        sh 'echo "Hello World"'
                    }
                }
                stage('testing_code') {
                    steps {
                        sh 'echo "Hello World"'
                    }
                }
            }
        }

        stage('Deploying to one more env') {
            stages {
                stage('deploy_to_dev') {
                    steps {
                        sh 'echo "testing in dev"'
                    }
                }
            }
        }
         stage('Deploying test env') {
            stages {
                stage('deploy_to_test') {
                    steps {
                        sh 'echo "testing in dev"'
                    }
                }
            }
        }
    }
}