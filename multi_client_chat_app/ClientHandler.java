// ClientHandler.java

package multi_client_chat_app;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

public class ClientHandler implements Runnable {
    private static ArrayList<ClientHandler> clientHandlerList = new ArrayList<>();
    private Socket socket;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;
    private String clientUsername;

    public ClientHandler(Socket socket) {
        try {
            this.socket = socket;
            this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.clientUsername = bufferedReader.readLine();
            clientHandlerList.add(this);
            System.out.println("Client connected: " + socket + " Username: (" + clientUsername + ")");
            broadcastMessage("SERVER: " + clientUsername + " has entered the chat.");
        } catch (IOException e) {
            closeSocket();
        }
    }

    public void run() {
        String clientMessage;
        try {
            while ((clientMessage = bufferedReader.readLine()) != null) {
                broadcastMessage(clientUsername + ": " + clientMessage);
            }
        } catch (IOException e) {
            closeSocket();
        }
    }

    public void broadcastMessage(String message) {
        for (ClientHandler clientHandler : clientHandlerList) {
            if (!clientHandler.clientUsername.equals(clientUsername)) {
                try {
                    clientHandler.bufferedWriter.write(message + "\n");
                    clientHandler.bufferedWriter.flush();
                } catch (IOException e) {
                    clientHandler.closeSocket();
                }
            }
        }
    }

    public void closeSocket() {
        clientHandlerList.remove(this);
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
        broadcastMessage("SERVER: " + clientUsername + " has left the chat.");
    }
}
