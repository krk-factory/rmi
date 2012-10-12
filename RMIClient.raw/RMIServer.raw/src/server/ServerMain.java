package server;

import common.Hello;
import java.rmi.server.UnicastRemoteObject;
import javax.naming.Context;
import javax.naming.InitialContext;

public class ServerMain {

    public static void main(String[] args) {
        try {
            Server obj = new Server();
            Hello stub = (Hello) UnicastRemoteObject.exportObject(obj, 0);
            // Bind the remote object's stub in the registry

            Context ctx = new InitialContext();
            ctx.rebind("rmi:Hello", stub);

            System.out.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
