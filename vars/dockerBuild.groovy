stage('Build Docker Image') {
    steps {
        script {
            dockerBuild(
                "cartservice",
                env.IMAGE_TAG
            )
        }
    }
}
