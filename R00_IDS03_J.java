if (loginSuccessful) {
    logger.severe("Userloginsucceededfor:" + sanitizeUser(username));
} else {
    logger.severe("Userloginfailedfor:" + sanitizeUser(username));
}
publicStringsanitizeUser(Stringusername) {
    returnPattern.matches("[A−Za−z0−9]+", username))
        ? username : "unauthorizeduser";
}
