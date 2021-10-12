void call(String channel, String message) {
    send(channel, message)
}

void send(String channel, String message, String color) {
    send(channel: channel,
         message: "${BUILD_URL}\n${message}",
         color: color)
}

void send(String channel, String message) {
    send(channel: channel, message: "${BUILD_URL}\n${message}")
}

void send(Map params=[:]) {
    Map defaultParams = [
        baseUrl: "https://jenkins-book.slack.com/services/hooks/jenkins-ci/",
        tokenCredentialId: "slack-token",
    ]
    slackSend(defaultParams << params)
}
