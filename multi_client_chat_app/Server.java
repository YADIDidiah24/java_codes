// Server.java

package multi_client_chat_app;

import java.io.IOException;
import java.net.*;

public class Server {
    private ServerSocket serverSocket = null;

    public Server(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
    }

    public void startServer() {
        try {
            System.out.println("Server started...");
            while (!serverSocket.isClosed()) {
                Socket socket = serverSocket.accept();
                

                ClientHandler clientHandler = new ClientHandler(socket);
                Thread thread = new Thread(clientHandler);
                thread.start();
            }
        } catch (IOException e) {
            System.err.println("Error starting the server: " + e.getMessage());
        }
    }

    public void closeSocket() {
        if (serverSocket != null && !serverSocket.isClosed()) {
            try {
                serverSocket.close();
                System.out.println("Server socket closed.");
            } catch (IOException e) {
                System.err.println("Error closing server socket: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            Server server = new Server(serverSocket);
            server.startServer();
        } catch (IOException e) {
            System.err.println("Error creating server socket: " + e.getMessage());
        }
    }
}
