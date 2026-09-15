pipeline {
    agent {
        label 'node-repo'
    }

    stages {

        stage('Build') {
            steps {
                sh 'mvn clean'
                sh 'mvn validate'
                sh 'mvn compile'
                sh 'mvn package -DskipTests'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
                sh 'mvn verify'
            }
        }

        stage('Deploy') {
            steps {
                sh 'mvn install'
                sh 'mvn deploy'
            }
        }
    }
}