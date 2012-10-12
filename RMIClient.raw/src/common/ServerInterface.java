package common;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServerInterface extends Remote {

    String sayHello(int i) throws RemoteException;

    String addClient(ClientInterface k) throws RemoteException;

    void sendMessage(String message) throws RemoteException;
}
