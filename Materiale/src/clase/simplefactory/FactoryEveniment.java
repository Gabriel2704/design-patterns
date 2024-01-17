package clase.simplefactory;

public class FactoryEveniment {
	public Eveniment getPersonal(TipEveniment tipEveniment, String nume, int nrParticipanti, float dimensiuneLocatie, boolean eInterior) throws Exception {
		switch (tipEveniment) {
			case CONCERT:
				return new Concert(nume, nrParticipanti, dimensiuneLocatie, eInterior);
			
			default:
				throw new Exception();
		}
	}
}
