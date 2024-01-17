package clase.decorator;

public class DecoratorLMA extends DecoratorAbstract{
	
	public DecoratorLMA(EvenimentAbstract eveniment) {
		super(eveniment);
	}
	
	@Override
	public void printeazaFelicitare() {
		System.out.println("Felicitare - La multi ani!");
	}
	
	public void printeaza() {
		super.printeaza();
		System.out.println("La multi ani!");
	}

}
