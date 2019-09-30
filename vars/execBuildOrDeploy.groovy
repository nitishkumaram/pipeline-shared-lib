def call(String command) {
    if(command == "build"){
        pipeline{
            agent any
            stages{
                stage("Build"){
                    steps{
                        echo "Build is executing"
                    }
                }
            }
        }
    }
    else if(command == "deploy"){
        pipeline{
            agent any
            stages{
                stage("Deploy"){
                    steps{
                        echo "Deploy is executing"
                    }
                }
            }
        }
    }
    else{
        pipeline{
            agent any
            stages{
                stage("Do Nothing"){
                    steps{
                        echo "Doing Nothing"
                    }
                }
            }
        }
    }
}
