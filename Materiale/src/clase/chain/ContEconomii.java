package clase.chain;

public class ContEconomii extends Cont{
	public ContEconomii(float sold) {
		super(sold);
	}

	@Override
	public void plateste(float suma) {
		if (super.getSold() >= suma) {
			super.setSold(super.getSold() - suma);
			System.out.println("Ai platit cu contul de economii");
		} else {
			if (super.getSuccesor() == null) {
				System.out.println("Nu se poate efectua plata!");
			} else {
				super.getSuccesor().plateste(suma);
			}
		}
	}
}