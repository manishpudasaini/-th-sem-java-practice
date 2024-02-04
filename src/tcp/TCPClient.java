package tcp;

import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) {
        try {
            // Create a Socket to connect to the server on localhost and port 6789
            Socket clientSocket = new Socket("localhost", 6789);

            // Create input and output streams for communication with the server
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter outToServer = new PrintWriter(clientSocket.getOutputStream(), true);

            // Send a message to the server
            outToServer.println("Hello, Server!");

            // Read the server's response
            String serverResponse = inFromServer.readLine();
            System.out.println("Received from server: " + serverResponse);

            // Close the connection
            inFromServer.close();
            outToServer.close();
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

