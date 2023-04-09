import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClienteRMI {

	public static void main(String[] args) throws RemoteException, NotBoundException {
		
		Registry registry = LocateRegistry.getRegistry("192.168.2.115");
		FilmesRemoto filme = (FilmesRemoto) registry.lookup("Filme");
		String resultado = filme.dados("Drama", "22:00");
		System.out.println(resultado);
	}

}
