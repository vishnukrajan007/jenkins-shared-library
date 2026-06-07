def call(String imageRepo,
         String imageTag) {

    sh """
        trivy image \
        ${imageRepo}:${imageTag}
    """
}
