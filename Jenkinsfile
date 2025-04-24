pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'Checking out the code from repository...'
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo 'Building the Java project...'
                bat 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                echo 'Running unit tests...'
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                echo 'Packaging the project...'
                bat 'mvn package'
            }
        }
    }

    post {
        success {
            echo 'Build and Tests were successful.'
        }
        failure {
            echo 'Build or Tests failed.'
        }
    }
}
