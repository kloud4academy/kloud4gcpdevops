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
stage('Test Chrome111') {
          steps {
            echo 'Testing Chrome;exit:0'
          }
        stage('Test Chrome') {
          steps {
            echo 'Testing Chrome;exit:0'
          }
        }

      }
    }

    stage('Deploy111111') {
      steps {
        echo 'Deploy'
      }
    }

  }
}
