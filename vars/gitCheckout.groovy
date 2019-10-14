def call(Map stageParams) {
    checkout([$class: 'GitSCM', branches: [[name: stageParams.branch]], userRemoteConfigs: [[url: stageParams.url]]])
}

// Reference: https://devopscube.com/create-jenkins-shared-library/