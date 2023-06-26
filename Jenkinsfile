pipeline {
  agent any
  
  stages {
    stage('Clone') {
      steps {
        git branch: 'main', url: 'https://github.com/ManishVishwakarma/jenkinsTest.git'
      }
    }
    
    stage('Build') {
      steps {
        bat './mvnw clean package'
	bat './mvnw clean install'
      }
    }
    
    stage('Test') {
      steps {
        bat './mvnw test'
      }
    }
    
    stage('Deploy') {
      steps {
        bat 'java -jar target/your-application.jar --server.port=8001 > /dev/null 2>&1 &'
        sleep 10
      }
    }
  }
}
