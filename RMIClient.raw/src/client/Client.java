/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import common.ClientInterface;

/**
 *
 * @author student
 */
public class Client implements ClientInterface
{

    public void showMessage(String message)
    {
        System.out.println(message);
    }
    
}
