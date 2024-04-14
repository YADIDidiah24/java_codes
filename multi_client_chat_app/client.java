// Client.java

package multi_client_chat_app;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private Socket socket;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;
    private String username;

    public Client(Socket socket, String username) {
        try {
            this.socket = socket;
            this.username = username;
            this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        } catch (IOException e) {
            closeSocket();
        }
    }

    public void sendMessage() {
        try {
            bufferedWriter.write(username + "\n");
            bufferedWriter.flush();

            Scanner scanner = new Scanner(System.in);
            while (socket.isConnected()) {
                String messageToSend = scanner.nextLine();
                bufferedWriter.write(messageToSend + "\n");
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            closeSocket();
        }
    }

    public void listenForMessage() {
        new Thread(() -> {
            String chatMessage;
            try {
                while ((chatMessage = bufferedReader.readLine()) != null) {
                    System.out.println(chatMessage);
                }
            } catch (IOException e) {
                closeSocket();
            }
        }).start();
    }

    public void closeSocket() {
        try {
            if (bufferedReader != null)
                bufferedReader.close();
            if (bufferedWriter != null)
                bufferedWriter.close();
            if (socket != null && !socket.isClosed())
                socket.close();
        } catch (IOException e) {
            System.err.println("Error closing socket: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your username for entering the chat: ");
            String username = scanner.nextLine();
            Socket socket = new Socket("localhost", 5000);
            Client client = new Client(socket, username);
            client.listenForMessage();
            client.sendMessage();
        } catch (IOException e) {
            System.err.println("Error connecting to server: " + e.getMessage());
        }
    }
}
