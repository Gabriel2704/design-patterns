package clase.facade;

import clase.facade.Locatie;

public class Facade {
	public static boolean esteEligibil(Eveniment eveniment) {
		if ("Sala mare".equals(eveniment.getStareSala())) {
			Public public1 = new Public();
			if (public1.arePublic(eveniment)) {
				if (Locatie.esteInCladire(eveniment)) {
					return true;
				}
			}
		}
		return false;
	}
}
