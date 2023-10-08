// Rule 00. Input Validation and Data Sanitization (IDS)
// IDS03-J. Do not log unsanitized user input 

if (loginSuccessful) {
    logger.severe("Userloginsucceededfor:" + sanitizeUser(username));
} else {
    logger.severe("Userloginfailedfor:" + sanitizeUser(username));
}
publicStringsanitizeUser(Stringusername) {
    returnPattern.matches("[A−Za−z0−9]+", username))
        ? username : "unauthorizeduser";
}
