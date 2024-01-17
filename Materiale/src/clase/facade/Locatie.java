package clase.facade;

public class Locatie {
	public static boolean esteInCladire(Eveniment eveniment) {
		if (eveniment.eInterior() == true) {
			return true;
		}
		return false;
	}
}
