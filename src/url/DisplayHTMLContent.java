package url;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class DisplayHTMLContent {

    public static void main(String[] args) {
        String url = "http://www.google.com"; // URL to connect

        try {
            // Connect to the URL
            String htmlContent = printHTMLContent(url);

            // Display HTML content on the console
            System.out.println("HTML Content:\n" + htmlContent);

            // Save HTML content to a file
            saveToFile(htmlContent, "output.html");
            System.out.println("HTML content saved to output.html");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String printHTMLContent(String urlString) throws IOException {
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
                response.append("\n");
            }

            return response.toString();
        } finally {
            connection.disconnect();
        }
    }

    private static void saveToFile(String content, String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
