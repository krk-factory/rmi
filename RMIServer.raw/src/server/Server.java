package server;


import common.ClientInterface;
import common.ServerInterface;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

public class Server implements ServerInterface {
    
    private List<ClientInterface> clients = new ArrayList<ClientInterface>();

      
    public String sayHello(int i) {
		return "Hello, client you sent me this: " + i; 
    }

    public String addClient(ClientInterface k) throws RemoteException {
        clients.add(k);
        System.out.println("New client connected");
        return "OK.";
    }

    public void sendMessage(String message) throws RemoteException {
        System.out.println("DEBUG: Received message: " + message);
        
        for(ClientInterface client : clients){
            client.sendMessage(message);
        }
    }
        
}