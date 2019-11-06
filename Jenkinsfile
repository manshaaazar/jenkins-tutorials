pipeline{
    agent any
    environment {
        CC='clang'
    }
    stages{
        stage('Build'){
            environment{
                build= "Build Envoirnment"
            }
            steps{
                echo "Building..."
            }
            
        }
        stage('Test'){
            environment{
                test="Test Envoirnment"
            }
            steps{
                echo "Testing..."
            }
        }
        stage('Deploy'){
            environment{
                deploy="Deploy Environment"
            }
            steps{
                echo "Deploying..."
            }
        }
        stage('Example'){
            steps{
                echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
            }
            
        }
        stage('Environment Variables List'){
            steps{
                echo 'printenv'
            }
        }

    }
}
