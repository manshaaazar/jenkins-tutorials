pipeline {
  agent any
  stages {
    stage('Clone Repo') {
      steps {
        git(url: 'https://github.com/manshaaazar/node-deployment.git', branch: 'master', credentialsId: 'github')
      }
    }

    stage('Installing Dep') {
      steps {
        sh 'npm install'
      }
    }

  }
  post {
    always {
      success() {
        echo 'Docker image successfully download and run in dokcer'
      }

      failure() {
        echo 'Docker image build Failed!'
      }

    }

  }
}