pipeline {
  agent any
  stages {
    stage('Build...') {
      parallel {
        stage('Build...') {
          steps {
            echo 'Build'
          }
        }

        stage('Test Firebox') {
          steps {
            sh '''echo "Testing Firebox"
'''
          }
        }

        stage('Test Chrome') {
          steps {
            sh 'echo "Testing Chrome"'
          }
        }

        stage('Test Edg') {
          steps {
            sh 'echo "Test Edg"'
          }
        }

      }
    }

    stage('Deploy') {
      steps {
        echo 'Deploy'
      }
    }

  }
}