/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author student
 */
public interface ClientInterface extends Remote {
    void sendMessage(String message) throws RemoteException;
    

}
