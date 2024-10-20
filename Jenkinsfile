pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/nelsonle39/lab2.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package'  
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test' 
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying the application...'
            }
        }
    }
    post {
        success {
            echo 'Build and Tests completed successfully!'
        }
        failure {
            echo 'The build or tests failed!'
        }
    }
}
