public class DaemonThreadExample {

    public static void main(String[] args) throws InterruptedException {

        // Step 1: Create a Thread
        Thread daemonWorker = new Thread(() -> {
            // This is what the daemon thread will do
            while (true) { // It will keep running forever
                try {
                    System.out.println("Daemon: I'm running in the background...");
                    Thread.sleep(1000); // Wait for 1 second
                } catch (InterruptedException e) {
                    System.out.println("Daemon: I was interrupted!");
                    break; // If interrupted
                }
            }
        });

        // Step 2: Make it a Daemon Thread
        daemonWorker.setDaemon(true); // This line is crucial

        // Step 3: Start the Daemon Thread
        daemonWorker.start();

        // Main program continues its work
        System.out.println("Main: Daemon thread started. Main program doing its stuff for 3 seconds...");
        Thread.sleep(3000); // Main program waits for 3 seconds

        System.out.println("Main: Main program is done and exiting.");
        // When the main program exits, the daemon thread will also stop automatically.
    }
}