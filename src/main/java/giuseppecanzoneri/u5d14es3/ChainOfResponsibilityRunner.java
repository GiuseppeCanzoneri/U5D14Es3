package giuseppecanzoneri.u5d14es3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import giuseppecanzoneri.u5d14es3.military.Ufficiale;
import giuseppecanzoneri.u5d14es3.military.officers.Capitano;
import giuseppecanzoneri.u5d14es3.military.officers.Colonnello;
import giuseppecanzoneri.u5d14es3.military.officers.Generale;
import giuseppecanzoneri.u5d14es3.military.officers.Maggiore;
import giuseppecanzoneri.u5d14es3.military.officers.Tenente;

@Component
public class ChainOfResponsibilityRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
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
