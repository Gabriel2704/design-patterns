package clase.composite;

import java.util.ArrayList;
import java.util.List;

public class Eveniment implements ComponentaMeniu {
	private String nume;
	private int nrParticipanti;
	private float dimensiuneLocatie;
	private boolean eInterior;
	private List<ComponentaMeniu> lista;
	
	// constructor fara param
	public Eveniment() {
		super();
	}
	
	// constructor cu param
	public Eveniment(String nume, int nrParticipanti, float dimensiuneLocatie, boolean eInterior) {
		super();
		this.nume = nume;
		this.nrParticipanti = nrParticipanti;
		this.dimensiuneLocatie = dimensiuneLocatie;
		this.eInterior = eInterior;
		this.lista = new ArrayList<ComponentaMeniu>();
	}
	
	// get/set
	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getNrParticipanti() {
		return nrParticipanti;
	}

	public void setNrParticipanti(int nrParticipanti) {
		this.nrParticipanti = nrParticipanti;
	}

	public float getDimensiuneLocatie() {
		return dimensiuneLocatie;
	}

	public void setDimensiuneLocatie(float dimensiuneLocatie) {
		this.dimensiuneLocatie = dimensiuneLocatie;
	}

	public boolean eInterior() {
		return eInterior;
	}

	public void seteInterior(boolean eInterior) {
		this.eInterior = eInterior;
	}

	// toString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Eveniment [nume=");
		builder.append(nume);
		builder.append(", nrParticipanti=");
		builder.append(nrParticipanti);
		builder.append(", dimensiuneLocatie=");
		builder.append(dimensiuneLocatie);
		builder.append(", eInterior=");
		builder.append(eInterior);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public void adaugaNod(ComponentaMeniu componentaMeniu) throws Exception {
		lista.add(componentaMeniu);
	}

	@Override
	public void stergeNod(ComponentaMeniu componentaMeniu) {
		lista.remove(componentaMeniu);
	}

	@Override
	public ComponentaMeniu getNod(int index) {
		if (index >= 0 && index < lista.size()) {
			return lista.get(index);
		}

		return null;
	}

	@Override
	public void printeaza() {
		System.out.println("Evenimentul " + nume);

		for (ComponentaMeniu optiune : lista) {
			optiune.printeaza();
		}
	}
	
	
}
