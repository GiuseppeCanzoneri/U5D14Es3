package giuseppecanzoneri.u5d14es3.military.officers;

import giuseppecanzoneri.u5d14es3.military.Ufficiale;

public class Maggiore extends Ufficiale {
	public Maggiore() {
		super("Maggiore", 2000);
	}

	@Override
	protected void approveSalary() {
		System.out.println("Il maggiore approva lo stipendio.");
	}

	@Override
	protected void rejectSalary() {
		System.out.println("Il maggiore rifiuta lo stipendio.");
	}
}
