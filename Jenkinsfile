@Library('my-shared-library') _

pipeline{

    agent any
    //agent { label 'Demo' }

    parameters{

        choice(name: 'action', choices: 'create\ndelete', description: 'Choose create/Destroy')
        string(name: 'ImageName', description: "name of the docker build", defaultValue: 'javapp')
        string(name: 'ImageTag', description: "tag of the docker build", defaultValue: 'v1')
        string(name: 'DockerHubUser', description: "name of the Application", defaultValue: 'mullya9')
    }

    stages{

         stage('Clean Workspace') {
         steps {
           deleteDir() // Deletes entire workspace
             }
        }
         
        stage('Git Checkout'){
                    when { expression {  params.action == 'create' } }
            steps{
            gitCheckout(
                branch: "main",
                url: "https://github.com/AkshataMullya/Java_app_3.0.git"
            )
            }
        }
    

        stage('Unit Maven'){
                when {expression {params.action == 'create'}}
            steps{
                script{
                    mvnTest() // Here we are calling mvnIntegrationTest Groovy file from shared Libraries
                    
                }
            }
        }
        stage('Interation Maven')
        {
            when{expression {params.action == 'create'}}
            steps{

                script{
                    mvnIntegrationTest()
                }
            }

        }

}
}