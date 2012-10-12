/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import common.ClientInterface;
import java.rmi.RemoteException;

/**
 *
 * @author student
 */
public class Client implements ClientInterface
{

    public void sendMessage(String message)
    {
     
        System.out.println(message);
    }
    
}
