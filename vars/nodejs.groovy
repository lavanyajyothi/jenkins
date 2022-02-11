def call(String COMPONENT) {
  pipeline {
    agent any

    stages {

      stage('compile') {
        steps {
          sh "echo COMPONENT  = '${COMPONENT}"
        }
      }


//      stage('code quality') {
//        steps {
//          sh 'echo compile'
//        }
//      }

//      stage('test cases') {
//        steps {
//          sh 'echo compile'
//        }
//      }
    }
  }
}






