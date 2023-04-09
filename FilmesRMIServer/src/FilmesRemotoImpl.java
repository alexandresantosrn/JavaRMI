import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class FilmesRemotoImpl extends UnicastRemoteObject implements FilmesRemoto {

	protected FilmesRemotoImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String dados(String genero, String horario) throws RemoteException {
		String msg = retornaDados(genero, horario);
		return msg;
	}

	private String retornaDados(String genero, String horario) {
		String msg = "";
		Filme filme = new Filme();
		System.out.println(genero);
		
			if (genero.equals("Drama")) {
				filme.setNome("Tomates Verdes Fritos");
				filme.setGenero(genero);
				filme.setHorario(horario);
				filme.setLocal("TV Globo");

				msg = "O filme " + filme.getNome() + " do gênero: " + filme.getGenero() + " será transmitido junto à "
						+ filme.getLocal() + " às: " + filme.getHorario();
			}
			
			else if (genero.equals("Romance")) {
				filme.setNome("Crepúsculo");
				filme.setGenero(genero);
				filme.setHorario(horario);
				filme.setLocal("Cinema Moviecom");

				msg = "O filme " + filme.getNome() + " do gênero: " + filme.getGenero() + " será transmitido junto à "
						+ filme.getLocal() + " às: " + filme.getHorario();
			}

			else if (genero.equals("Policial")) {
				filme.setNome("Tropa de Elite");
				filme.setGenero(genero);
				filme.setHorario(horario);
				filme.setLocal("SBT TV");

				msg = "O filme " + filme.getNome() + " do gênero: " + filme.getGenero() + " será transmitido junto à "
						+ filme.getLocal() + " às: " + filme.getHorario();
			}

			else if (genero.equals("Suspense")) {
				filme.setNome("Pânico 5");
				filme.setGenero(genero);
				filme.setHorario(horario);
				filme.setLocal("Cinema Cinepólis");

				msg = "O filme " + filme.getNome() + " do gênero: " + filme.getGenero() + " será transmitido junto à "
						+ filme.getLocal() + " às: " + filme.getHorario();
			}

			else if (genero.equals("Faroeste")) {
				filme.setNome("Django Livre");
				filme.setGenero(genero);
				filme.setHorario(horario);
				filme.setLocal("TV Record");

				msg = "O filme " + filme.getNome() + " do gênero: " + filme.getGenero() + " será transmitido junto à "
						+ filme.getLocal() + " às: " + filme.getHorario();
			}		
			
			else  {
				msg = "Gênero inválido! Selecione gênero de filme diferente!!!";		
			}
			
		return msg;
	}

}
