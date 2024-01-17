package clase.factorymethod;

public class Concert extends Eveniment {
	
	// constructor param
	public Concert(String nume, int nrParticipanti, float dimensiuneLocatie, boolean eInterior) {
		super(nume, nrParticipanti, dimensiuneLocatie, eInterior);
	}

	// toStrings
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Concert [nume()=");
		builder.append(getNume());
		builder.append(", NrParticipanti()=");
		builder.append(getNrParticipanti());
		builder.append(", DimensiuneLocatie()=");
		builder.append(getDimensiuneLocatie());
		builder.append(", eInterior()=");
		builder.append(eInterior());
		builder.append("]");
		return builder.toString();
	}	
}
