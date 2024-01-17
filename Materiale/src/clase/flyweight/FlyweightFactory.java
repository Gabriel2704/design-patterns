package clase.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	private Map<String, Flyweight> participanti;
	
	public FlyweightFactory() {
		super();
		this.participanti = new HashMap<String,Flyweight>();
	}

	public Flyweight getEveniment(String nrTelefon) {
		Flyweight participant = participanti.get(nrTelefon);
		if (participant == null) {
			participant = new Participant("Ion",nrTelefon,"ion@gmail.com");
			participanti.put(nrTelefon, participant);
		}
		return participant;
	}
}
