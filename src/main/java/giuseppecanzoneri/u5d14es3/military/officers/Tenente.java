package giuseppecanzoneri.u5d14es3.military.officers;

import giuseppecanzoneri.u5d14es3.military.Ufficiale;

public class Tenente extends Ufficiale {
	public Tenente() {
		super("Tenente", 3000);
	}

	@Override
	protected void approveSalary() {
		System.out.println("Il Tenente approva lo stipendio.");
	}

	@Override
	protected void rejectSalary() {
		System.out.println("Il Tenente rifiuta lo stipendio.");
	}
}
