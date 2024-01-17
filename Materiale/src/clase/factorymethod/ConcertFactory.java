package clase.factorymethod;

public class ConcertFactory implements FactoryEveniment {

	@Override
	public Eveniment getEveniment(String nume, int nrParticipanti, float dimensiuneLocatie, boolean eInterior) {
		return new Concert(nume, nrParticipanti, dimensiuneLocatie, eInterior);
	}

}
