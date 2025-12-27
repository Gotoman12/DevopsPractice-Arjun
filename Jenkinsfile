pipeline{
    agent any

   environment {
        BACKEND_IMAGE = "arjunckm/springboot-backend:${BUILD_NUMBER}"
        FRONTEND_IMAGE = "arjunckm/react-frontend:${BUILD_NUMBER}"
   }

    stages{
        stage("GIT-CKECKOUT"){
            steps{
                git url:"https://github.com/Gotoman12/DevopsPractice-Arjun.git", branch:"React-SpringBoot"
            }
        }
        // Backend docker deployment to container
        stage("docker-build"){
            steps{
                 dir('backend-springboot'){
                    sh 'docker build -t ${BACKEND_IMAGE} .'
                 }
            }
        }
        stage("docker-run"){
            steps{
                dir('backend-springboot'){
                   sh 'docker kill backapp'
                    sh 'docker rm backapp'
                    sh 'docker run -it -d --name backapp -p 5000:8085 ${BACKEND_IMAGE}'
                }
            }
        }
        // Frontend docker deployment to container
        stage("frontend-build"){
            steps{
                 dir('frontend-react'){
                    sh 'docker build -t ${FRONTEND_IMAGE} .'
                 }
            }
        }
        stage("frontend-run"){
            steps{
                dir('frontend-react'){
                    docker kill backapp
                    docker rm backapp
                      sh 'docker run -it -d --name backapp -p 5002:3000 ${FRONTEND_IMAGE}'
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
                sh 'docker push ${BACKEND_IMAGE}'
                sh 'docker push ${FRONTEND_IMAGE}'
            }
        }
    }
}