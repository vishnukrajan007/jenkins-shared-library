def call(String service, String pipeline) {

    def changedFiles = sh(
        script: 'git diff --name-only HEAD~1 HEAD',
        returnStdout: true
    ).trim()

    if (changedFiles.contains(service)) {
        build job: pipeline
    }
}
