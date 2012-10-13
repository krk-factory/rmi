package client;

/*
 * Client.java
 *
 * Created on 18 marzec 2008, 18:03
 *
 * To change this template, choose Tools | Template Manager and open the
 * template in the editor.
 */
import common.ClientInterface;
import common.ServerInterface;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;
import javax.naming.Context;
import javax.naming.InitialContext;

/**
 *
 * @author student
 */
public class ClientMain {

    public static void main(String[] args) {
        try {
            Context ctx = new InitialContext();
            ServerInterface stub = (ServerInterface) ctx.lookup("rmi://10.10.100.237:2012/Hello");

            //String response = stub.sayHello(5);
            //System.out.println("response: " + response);

            Client k = new Client();
            ClientInterface myStub = (ClientInterface) UnicastRemoteObject.exportObject(k, 0);
            String message = stub.addClient(myStub);
            System.out.println(message);

            Scanner scanner = new Scanner(System.in);
            while(true) {
                String linia = scanner.nextLine();
                stub.sendMessage(linia);
            }
            

        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
