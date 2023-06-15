package giuseppecanzoneri.u5d14es3.military;

public abstract class Ufficiale {
	private String role;
	private int salary;
	private Ufficiale superiorUfficiale;

	public Ufficiale(String role, int salary) {
		this.role = role;
		this.salary = salary;
	}

	public void setSuperiorOfficer(Ufficiale superiorUfficiale) {
		this.superiorUfficiale = superiorUfficiale;
	}

	public void handleSalary(int requestedSalary) {
		if (requestedSalary >= salary) {
			approveSalary();
		} else if (superiorUfficiale != null) {
			superiorUfficiale.handleSalary(requestedSalary);
		} else {
			rejectSalary();
		}
	}

	protected abstract void approveSalary();

	protected abstract void rejectSalary();
}
