node{
    stage("Pull Repo") {
        git  "git@github.com:dilfuza97/Packer-image.git"
    }
    stage("Build AMI"){
        sh "packer build updated/updated.json"
    }
}
