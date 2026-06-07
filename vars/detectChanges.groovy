def call() {
    return sh(
        script: 'git diff --name-only HEAD~1 HEAD',
        returnStdout: true
    ).trim()
}
