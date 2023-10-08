// Rule 13. Input Output (FIO)
// FIO04-J. Release resources when they are no longer needed

try (FileInputStream stream = new FileInputStream(fileName);
     BufferedReader bufRead =
         new BufferedReader(new InputStreamReader(stream))) {
 
  String line;
  while ((line = bufRead.readLine()) != null) {
    sendLine(line);
  }
} catch (IOException e) {
  // Forward to handler
}
