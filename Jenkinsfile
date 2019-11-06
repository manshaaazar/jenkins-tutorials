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
            environemnt{
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
    post{
        always{
            failure{
                mail to: manshaehsan000@gmail.com, subject: "pipeline complete syntax but failed to get it completly"
            }
        }
    }
}