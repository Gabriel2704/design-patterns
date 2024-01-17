package clase.flyweight;

public class Participant implements Flyweight{
	
	private String nume;
	private String nrTelefon;
	private String email;
	
	public Participant(String nume, String nrTelefon, String email) {
		super();
		this.nume = nume;
		this.nrTelefon = nrTelefon;
		this.email = email;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Participant [nume=");
		builder.append(nume);
		builder.append(", nrTelefon=");
		builder.append(nrTelefon);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public void printeazaEveniment(Eveniment eveniment) {
		System.out.println(this.toString() + " " + eveniment.toString());
	}

}
