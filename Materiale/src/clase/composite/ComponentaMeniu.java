package clase.composite;

public interface ComponentaMeniu {
	public void adaugaNod(ComponentaMeniu componentaMeniu) throws Exception;
	public void stergeNod(ComponentaMeniu componentaMeniu);
	public ComponentaMeniu getNod(int index);
	public void printeaza();
}
