pipeline{
    agent any

    environment{
        IMAGE_NAME = "arjunckm/reactapp:${BUILD_NUMBER}"
        
    }

    stages{
        stage("GIT-CKECKOUT"){
            steps{
                git url:"https://github.com/Gotoman12/DevopsPractice-Arjun.git", branch:"React-SpringBoot"
            }
        }
        stage("docker-build"){
            steps{
                 dir('backend-springboot'){
                    sh 'docker build -t ${IMAGE_NAME} .'
                 }
            }
        }
        stage("docker-run"){
            steps{
                dir('backend-springboot'){
                      sh 'docker run -it -d --name backapp -p 5000:8085 ${IMAGE_NAME}'
                }
            }
        }
        stage("docker-login"){
            steps{
                script{
                    withCredentials([usernamePassword(credentialsId: 'DOCKER_HUB_CRED', passwordVariable: 'DOCKER_PASSWORD', usernameVariable: 'DOCKER_USERNAME')]) {
                       sh "echo $DOCKER_PASSWORD | docker login -u $DOCKER_USERNAME --password-stdin"
                  }
                }
            }
        }
        stage("docker-push"){
            steps{
                sh 'docker push ${IMAGE_NAME}'
            }
        }
    }
}