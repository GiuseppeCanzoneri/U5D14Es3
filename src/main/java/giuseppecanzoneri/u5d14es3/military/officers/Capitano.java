package giuseppecanzoneri.u5d14es3.military.officers;

import giuseppecanzoneri.u5d14es3.military.Ufficiale;

public class Capitano extends Ufficiale {
	public Capitano() {
		super("Capitano", 1000);
	}

	@Override
	protected void approveSalary() {
		System.out.println("Il capitano approva lo stipendio.");
	}

	@Override
	protected void rejectSalary() {
		System.out.println("Il capitano rifiuta lo stipendio.");
	}
}
