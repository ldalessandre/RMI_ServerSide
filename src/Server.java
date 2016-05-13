
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server implements Hello {

  public Server() {}
  
	
	public String sayHello() {
		return "Ola, mundo";
	}
	
	public static void main (String args[]) {
		System.setProperty("java.rmi.server.hostname","localhost:1010");
		try {
			
			//Create and export a remote object
			Server obj = new Server();
			Hello stub = (Hello) UnicastRemoteObject.exportObject(obj,0);
			
			//Register the remote object with a Java RMI registry
			Registry registry = LocateRegistry.getRegistry();
			registry.bind("Hello", stub);
			
			System.out.println("Server Ready");
		}
		catch (Exception e) {
			System.err.println("Server exception: " + e.toString());
			e.printStackTrace();
		}
	}
}

