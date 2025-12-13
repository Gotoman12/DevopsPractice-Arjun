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
                ssh '''
                echo "git workspace is created"
                '''
            }
        }
    }
    
}
