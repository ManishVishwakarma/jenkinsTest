pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/ManishVishwakarma/jenkinsTest.git'
            }
        }
        
        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }
        
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
        
        stage('Deploy') {
            steps {
                bat 'mvn spring-boot:run -Dspring-boot.run.arguments=--server.port=8082'
            }
        }
    }
}
