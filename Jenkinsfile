pipeline {
  agent any


  stages {
    stage('Hello') {
      steps {
        sh 'echo Hello'
        sh 'echo Bye'
        print 'Helloo'
        script {
          println  'Hello world'
          }
      }
    }
  }
  post {
    always {
      println 'post step'
    }
  }
}
