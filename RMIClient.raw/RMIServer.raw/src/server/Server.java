package server;


import common.Hello;

public class Server implements Hello {
      
    public String sayHello(int i) {
		return "Hello, client you sent me: " + i; 
    }
        
}