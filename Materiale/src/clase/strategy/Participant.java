package clase.strategy;

public class Participant {
	private Strategy strategie;
	private String nume;
	
	public Participant(Strategy strategie, String nume) {
		super();
		this.strategie = strategie;
		this.nume = nume;
	}

	public void setStrategie(Strategy strategie) {
		this.strategie = strategie;
	}
	
	public void platesteNota(float suma) {
		System.out.println(this.nume + " are de plata suma de " + suma + " lei");
		strategie.realizeazaPlata(suma);
	}
}
