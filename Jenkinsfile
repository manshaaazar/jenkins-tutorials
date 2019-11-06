pipeline{
    agent{
        docker{
            image:'docker'
            args:'-v $HOME/var/run/docker.sock:$HOME/var/run/docker.sock'
        }
    }
    stages{
        stage("Docker Version"){
            steps{
                sh 'docker --version'
            }
        }
    }
    post{
        always{
        success{
            echo "Docker image successfully download and run in dokcer"
        }
        failure{
            echo"Docker image build Failed!"
        }
    }
    
   }

}
