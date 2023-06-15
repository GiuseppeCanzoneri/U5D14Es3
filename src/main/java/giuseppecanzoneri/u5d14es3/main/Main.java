package giuseppecanzoneri.u5d14es3.main;

import giuseppecanzoneri.u5d14es3.military.Ufficiale;
import giuseppecanzoneri.u5d14es3.military.officers.Capitano;
import giuseppecanzoneri.u5d14es3.military.officers.Colonnello;
import giuseppecanzoneri.u5d14es3.military.officers.Generale;
import giuseppecanzoneri.u5d14es3.military.officers.Maggiore;
import giuseppecanzoneri.u5d14es3.military.officers.Tenente;

public class Main {
	public static void main(String[] args) {
		Ufficiale capitano = new Capitano();
		Ufficiale maggiore = new Maggiore();
		Ufficiale tenente = new Tenente();
		Ufficiale colonnello = new Colonnello();
		Ufficiale generale = new Generale();

		capitano.setSuperiorOfficer(maggiore);
		maggiore.setSuperiorOfficer(tenente);
		tenente.setSuperiorOfficer(colonnello);
		colonnello.setSuperiorOfficer(generale);

		int requestedSalary = 3500;
		generale.handleSalary(requestedSalary);
	}
}
