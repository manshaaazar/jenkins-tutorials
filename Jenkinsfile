pipeline{
    agent any
    parameters {
        string(name: 'PERSON', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')

        text(name: 'BIOGRAPHY', defaultValue: '', description: 'Enter some information about the person')

        booleanParam(name: 'TOGGLE', defaultValue: true, description: 'Toggle this value')

        choice(name: 'CHOICE', choices: ['One', 'Two', 'Three'], description: 'Pick something')

        password(name: 'PASSWORD', defaultValue: 'SECRET', description: 'Enter a password')
    }
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
                sh'printenv'
            }
        }
        stage('Parameters in jenkinsfile') {
            steps {
                echo "Hello ${params.PERSON}"

                echo "Biography: ${params.BIOGRAPHY}"

                echo "Toggle: ${params.TOGGLE}"

                echo "Choice: ${params.CHOICE}"

                echo "Password: ${params.PASSWORD}"
            }
        }
        stage('Example of input') {
            input {
                message "Should we continue?"
                ok "Yes, we should."
                submitter "alice,bob"
                parameters {
                    string(name: 'PERSON', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')
                }
            }
            steps {
                echo "Hello, ${PERSON}, nice to meet you."
            }
        }
        
    }
    post{
        success{
            echo "Successfully executed"
        }
        failure{
            echo "Failed to execte Successfully"
        }
    }
}

