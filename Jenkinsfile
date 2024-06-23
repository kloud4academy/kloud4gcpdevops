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
            echo 'Testing FireBox'
          }
        }

        stage('Test Chrome') {
          steps {
            echo 'Testing Chrome'
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