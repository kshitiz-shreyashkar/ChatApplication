package org.example;

public class Main {
    public static void main(String[] args) {
        // Start the server in a new thread
        new Thread(() -> {
            ChatServer.main(args);  // You may need to adjust this if ChatServer doesn't have a main method
        }).start();

        // Start the client
        ChatClient.main(args);  // Adjust if necessary
        ChatClient.main(args);  // Adjust if necessary

    }
}
