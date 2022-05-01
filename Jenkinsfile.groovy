pipeline {
    agent {
        dockerfile {
            filename 'Dockerfile'
        }
    }
    stages {
        stage('Install') {
            steps {
                sh 'apt install python-pip && pip install virtualenv && virtualenv venv -p python3 && source venv/bin/activate'
            }
        }
    }
}