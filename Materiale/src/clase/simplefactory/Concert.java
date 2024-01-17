package clase.simplefactory;

public class Concert extends Eveniment{

	// constructor param
	public Concert(String nume, int nrParticipanti, float dimensiuneLocatie, boolean eInterior) {
		super(nume, nrParticipanti, dimensiuneLocatie, eInterior);
	}

	// toString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Concert [getNume()=");
		builder.append(getNume());
		builder.append(", getNrParticipanti()=");
		builder.append(getNrParticipanti());
		builder.append(", getDimensiuneLocatie()=");
		builder.append(getDimensiuneLocatie());
		builder.append(", eInterior()=");
		builder.append(eInterior());
		builder.append("]");
		return builder.toString();
	}	
}
