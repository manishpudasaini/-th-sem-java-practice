package tcp;

import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) {
        try {
            // Create a ServerSocket to listen for client connections on port 6789
            ServerSocket serverSocket = new ServerSocket(6789);
            System.out.println("Server is listening on port 6789...");

            // Wait for a client to connect
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected: " + clientSocket.getInetAddress());

            // Create input and output streams for communication with the client
            BufferedReader inFromClient = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter outToClient = new PrintWriter(clientSocket.getOutputStream(), true);

            // Read data from the client
            String clientMessage = inFromClient.readLine();
            System.out.println("Received from client: " + clientMessage);

            // Echo the message back to the client
            outToClient.println("Hello from Server!!");

            // Close the connections
            inFromClient.close();
            outToClient.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

