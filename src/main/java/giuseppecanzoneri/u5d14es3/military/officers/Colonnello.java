package giuseppecanzoneri.u5d14es3.military.officers;

import giuseppecanzoneri.u5d14es3.military.Ufficiale;

public class Colonnello extends Ufficiale {
	public Colonnello() {
		super("Colonnello", 4000);
	}

	@Override
	protected void approveSalary() {
		System.out.println("Il colonnello approva lo stipendio.");
	}

	@Override
	protected void rejectSalary() {
		System.out.println("Il colonnello rifiuta lo stipendio.");
	}
}
