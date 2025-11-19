pipeline{
    agent any
    stages{
        stage("First stage"){
            steps{
                sh '''
                  echo "hello arjun how are you"
                  '''
            }
        }
        stage("Second Stage"){
            steps{
                sh '''
                  python3 app.py 6 7
                  '''
            }
        }
        stage("GIT CHECKOUT"){
            steps{
                git url: "https://github.com/Gotoman12/DevopsPractice-Arjun.git", branch: 'main'
            }
        }
    }
}