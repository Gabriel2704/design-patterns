package clase.decorator;

public abstract class DecoratorAbstract implements EvenimentAbstract{
	private EvenimentAbstract eveniment;
	
	@Override
	public void printeaza() {
		eveniment.printeaza();
	}

	public DecoratorAbstract(EvenimentAbstract eveniment) {
		super();
		this.eveniment = eveniment;
	}
	
	public abstract void printeazaFelicitare();
}
