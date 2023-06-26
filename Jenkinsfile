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
        sh './mvnw clean package'
      }
    }
    
    stage('Test') {
      steps {
        sh './mvnw test'
      }
    }
    
    stage('Deploy') {
      steps {
        sh 'nohup java -jar target/your-application.jar --server.port=8001 > /dev/null 2>&1 &'
        sleep 10
      }
    }
  }
}
