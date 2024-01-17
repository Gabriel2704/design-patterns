package clase.strategy;

public class Eveniment {
	private String nume;
	private int nrParticipanti;
	private float dimensiuneLocatie;
	private boolean eInterior;
	
	// constructor fara param
	public Eveniment() {
		super();
	}
	
	// constructor cu param
	public Eveniment(String nume, int nrParticipanti, float dimensiuneLocatie, boolean eInterior) {
		super();
		this.nume = nume;
		this.nrParticipanti = nrParticipanti;
		this.dimensiuneLocatie = dimensiuneLocatie;
		this.eInterior = eInterior;
	}
	
	// get/set
	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getNrParticipanti() {
		return nrParticipanti;
	}

	public void setNrParticipanti(int nrParticipanti) {
		this.nrParticipanti = nrParticipanti;
	}

	public float getDimensiuneLocatie() {
		return dimensiuneLocatie;
	}

	public void setDimensiuneLocatie(float dimensiuneLocatie) {
		this.dimensiuneLocatie = dimensiuneLocatie;
	}

	public boolean eInterior() {
		return eInterior;
	}

	public void seteInterior(boolean eInterior) {
		this.eInterior = eInterior;
	}

	// toString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Eveniment [nume=");
		builder.append(nume);
		builder.append(", nrParticipanti=");
		builder.append(nrParticipanti);
		builder.append(", dimensiuneLocatie=");
		builder.append(dimensiuneLocatie);
		builder.append(", eInterior=");
		builder.append(eInterior);
		builder.append("]");
		return builder.toString();
	}
	
	
}
