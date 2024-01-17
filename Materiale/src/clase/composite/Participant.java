package clase.composite;

public class Participant implements ComponentaMeniu{
	String nume;

	public Participant(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void adaugaNod(ComponentaMeniu componentaMeniu) throws Exception {
		throw new Exception();
	}

	@Override
	public void stergeNod(ComponentaMeniu componentaMeniu) {
		throw new IllegalArgumentException();
	}

	@Override
	public ComponentaMeniu getNod(int index) {
		throw new IllegalArgumentException();
	}

	@Override
	public void printeaza() {
		System.out.println("Participant: " + nume);
	}
}
