package udp;

import java.net.*;

public class UDPClient {
    public static void main(String[] args) {
        try {
            // Create a DatagramSocket for sending UDP packets
            DatagramSocket clientSocket = new DatagramSocket();

            // Specify the server address and port
            InetAddress serverAddress = InetAddress.getByName("localhost");
            int serverPort = 9876;

            // Create a byte array containing the message to be sent
            String message = "Hello, Server!";
            byte[] sendData = message.getBytes();

            // Create a DatagramPacket for sending data to the server
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);

            // Send the packet to the server
            clientSocket.send(sendPacket);

            // Close the socket
            clientSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

