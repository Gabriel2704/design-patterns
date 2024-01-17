package clase.adaptorobiect;

public class AdapterSpatiuObiecte implements SpatiuAbstract{

	private Eveniment eveniment;
				
	public AdapterSpatiuObiecte(Eveniment eveniment) {
		super();
		this.eveniment = eveniment;
	}

	@Override
	public void inchiriazaSpatiu(float dimensiune) {
		eveniment.inchiriaza();		
	}

}
