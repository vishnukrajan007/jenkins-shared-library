def call(String imageName, String imageTag) {

    echo "Building ${imageName}:${imageTag}"

    sh """
        docker build -t ${imageName}:${imageTag} .
    """
}
