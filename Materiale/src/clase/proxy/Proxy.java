package clase.proxy;

public class Proxy implements EvenimentAbstract {

	private EvenimentAbstract eveniment;
	
	public Proxy(EvenimentAbstract eveniment) {
		super();
		this.eveniment = eveniment;
	}

	@Override
	public void participanti(TipEveniment tipEveniment, int nrParticipanti) {
		if(tipEveniment == TipEveniment.TEATRU) {
			eveniment.participanti(tipEveniment, nrParticipanti);
		} else {
			System.out.println("Nu mai organizam alte tipuri de evenimente!");
		}
	}
	
}
