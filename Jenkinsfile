pipeline{
    agent any
    tools{
        jdk "java-17"
        maven "Maven"
    }
    stages{
         stage("GIT CHECKOUT"){
            steps{
                git url:"https://github.com/Gotoman12/DevopsPractice-Arjun.git", branch:"dev"
            }
        }
        stage("mvn compile"){
            steps{
                dir("calculator-app"){
                    sh '''
                    mvn compile
                    '''
                }
            }
        }
        stage("mvn test"){
            steps{
                dir("calculator-app"){
                 sh '''
                       mvn test
                '''
                }  
            }
        }
           stage("mvn package"){
            steps{
                dir("calculator-app"){
                 sh '''
                       mvn package
                '''
                } 
            }
        }
    }
}