package udp;

import java.net.*;

public class UDPServer {
    public static void main(String[] args) {
        try {
            // Create a DatagramSocket to listen for client UDP packets on port 9876
            DatagramSocket serverSocket = new DatagramSocket(9876);
            System.out.println("Server is listening on port 9876...");

            // Create a byte array to store incoming data
            byte[] receiveData = new byte[1024];

            // Create a DatagramPacket for receiving data
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

            // Receive data from the client
            serverSocket.receive(receivePacket);

            // Extract the message from the received packet
            String clientMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Received from client: " + clientMessage);

            // Close the socket
            serverSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
