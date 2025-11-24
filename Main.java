import Cinema.Cinema;
import Cinema.Sala;

public class Main {

	public static void main(String[] args) {
		Cinema cinema = new Cinema("La perla");
		Sala sala1 = new Sala(19,10,15);
		cinema.aggiungiSala(sala1);
		sala1.mostraMappa();
	}

}
