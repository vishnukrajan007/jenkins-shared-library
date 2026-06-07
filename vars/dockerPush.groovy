def call(String imageRepo,
         String imageTag) {

    sh """
        docker push ${imageRepo}:${imageTag}
    """

}
