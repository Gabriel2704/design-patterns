package clase.factorymethod;

public interface FactoryEveniment {
	public Eveniment getEveniment(String nume, int nrParticipanti, float dimensiuneLocatie, boolean eInterior);
}