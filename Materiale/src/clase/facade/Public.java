package clase.facade;

public class Public {
	public static boolean arePublic(Eveniment eveniment) {
		if (eveniment.getNrParticipanti() <= 0) {
			return false;
		}
		return true;
	}
}
