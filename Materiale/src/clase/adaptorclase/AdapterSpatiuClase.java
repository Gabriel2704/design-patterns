package clase.adaptorclase;

public class AdapterSpatiuClase extends Eveniment implements SpatiuAbstract{
				
	public AdapterSpatiuClase(String nume, int nrParticipanti, float dimensiuneLocatie, boolean eInterior) {
		super(nume, nrParticipanti, dimensiuneLocatie, eInterior);
	}

	@Override
	public void inchiriazaSpatiu() {
		super.inchiriaza();			
	}

}
