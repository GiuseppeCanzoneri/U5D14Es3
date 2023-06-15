package giuseppecanzoneri.u5d14es3.military.officers;

import giuseppecanzoneri.u5d14es3.military.Ufficiale;

public class Generale extends Ufficiale {
	public Generale() {
		super("Generale", 5000);
	}

	@Override
	protected void approveSalary() {
		System.out.println("Il Generale approva lo stipendio.");
	}

	@Override
	protected void rejectSalary() {
		System.out.println("Il Generale rifiuta lo stipendio.");
	}
}
