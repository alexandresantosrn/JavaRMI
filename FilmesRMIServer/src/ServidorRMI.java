import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServidorRMI {

	public static void main(String[] args) throws RemoteException, AlreadyBoundException {

		FilmesRemoto filme = new FilmesRemotoImpl();
		Registry registry = LocateRegistry.createRegistry(1099);
		registry.bind("Filme", (Remote) filme);
		System.out.println("Servidor RMI pronto.");
	}

}
