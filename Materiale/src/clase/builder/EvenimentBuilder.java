package clase.builder;

import clase.builder.Eveniment;

public class EvenimentBuilder implements AbstractBuilder{

	// obiect neaparat privat daca nu e inclus builderul in clasa
	private Eveniment eveniment;	
	
	// constructor fara param
	public EvenimentBuilder() {
		super();
		this.eveniment = new Eveniment("",0, 0f, false);
	}

	// constructor cu param
	public EvenimentBuilder(String nume) {
		super();
		this.eveniment = new Eveniment(nume, 0, 0f, false);
	}
	
	// functii set
	public EvenimentBuilder setNume(String nume) {
		eveniment.setNume(nume);
		return this;
	}
	
	public EvenimentBuilder setNrParticipanti(int nr) {
		eveniment.setNrParticipanti(nr);
		return this;
	}
	
	public EvenimentBuilder setDimensiuneLocatie(float dimnesiune) {
		eveniment.setDimensiuneLocatie(dimnesiune);
		return this;
	}
	
	public EvenimentBuilder seteInterior(boolean eInterior) {
		eveniment.seteInterior(eInterior);
		return this;
	}

	@Override
	public Eveniment build() {
		return eveniment;
	}

}
