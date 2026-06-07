def call(String releaseName,
         String chartPath,
         String namespace,
         String imageRepo,
         String imageTag) {

    sh """
        helm upgrade --install ${releaseName} \
        ${chartPath} \
        -n ${namespace} \
        --create-namespace \
        --set image.repository=${imageRepo} \
        --set image.tag=${imageTag}
    """
}
