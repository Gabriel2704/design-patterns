package clase.singleton;

public class Eveniment {
	private String nume;
	private int nrParticipanti;
	private float dimensiuneLocatie;
	private boolean eInterior;
	
	private static Eveniment eveniment = null;
	
	// constructor cu param
	private Eveniment(String nume, int nrParticipanti, float dimensiuneLocatie, boolean eInterior) {
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
	
	public static synchronized Eveniment getInstance(String nume, int nrParticipanti, float dimensiuneLocatie, boolean eInterior) {
		if(eveniment == null) {
			eveniment = new Eveniment(nume, nrParticipanti, dimensiuneLocatie, eInterior);
		}
		return eveniment;
	}
}
