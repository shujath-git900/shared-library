def call() {
    node(){

        if (env.TAG_NAME ==~'.*'){
            stage('Software Release') {
                print 'OK'
            }
            stage('Build Code') {
                print 'OK'
            }
        }
        else{

            stage('Code Lint') {
                print 'OK'
            }

            if(env.BRANCH_NAME != 'master'){
                stage('Unit Test') {
                    print 'OK'
                }
                stage('Integration Test') {
                    print 'OK'
                }
            }

            stage('Sonar Scan') {
                print 'OK'
            }

        }
    }

}









