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
