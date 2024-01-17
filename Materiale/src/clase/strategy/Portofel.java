package clase.strategy;

public class Portofel implements Strategy{
	float sumaDisponibila;

	public Portofel(float sumaDisponibila) {
		super();
		this.sumaDisponibila = sumaDisponibila;
	}


	@Override
	public void realizeazaPlata(float suma) {
		if(sumaDisponibila >= suma) {
			System.out.println("Tranzactia a fost efectuata pentru suma de  " + suma );
			sumaDisponibila -= suma;
			return;
		}
		System.out.println("Fonduri insuficiente");
		
	}

}