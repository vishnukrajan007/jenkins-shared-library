def call(servicePath) {

    def changes = sh(
        script: "git diff --name-only HEAD~1 HEAD",
        returnStdout: true
    ).trim()

    echo "Changed files:\n${changes}"

    if (!changes.contains(servicePath)) {
        echo "No changes in ${servicePath} → skipping pipeline"
        currentBuild.result = 'SUCCESS'
        env.SKIP = "true"
    } else {
        env.SKIP = "false"
    }
}
