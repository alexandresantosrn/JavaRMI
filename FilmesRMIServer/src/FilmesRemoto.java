import java.rmi.Remote;
import java.rmi.RemoteException;

public interface FilmesRemoto extends Remote{

	String dados(String genero, String horario) throws RemoteException;
}
