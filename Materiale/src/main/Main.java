package main;

public class Main {

	public static void main(String[] args) throws Exception {
		
		//singleton
//		Eveniment eveniment1 = Eveniment.getInstance("Fuego", 1000, 1234.5f, true);
//		System.out.println(eveniment1.toString());
//		eveniment1.seteInterior(false);
//		System.out.println(eveniment1.toString());
		
		// factory method
//		FactoryEveniment factory = new ConcertFactory();
//		Eveniment eveniment	= factory.getEveniment("Fuego", 1000, 1234.5f, true);
//		System.out.println(eveniment.toString());
		
		// simple factory
//		try {
//			FactoryEveniment factory = new FactoryEveniment();
//			Eveniment eveniment = new FactoryEveniment().getPersonal(TipEveniment.CONCERT, "Fuego", 1000, 1234.5f, true);
//			System.out.println(eveniment.toString());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		// builder
//		Eveniment eveniment1 = new EvenimentBuilder()
//				.setNrParticipanti(20).seteInterior(false).build();
//		System.out.println(eveniment1);
//		
//		Eveniment eveniment2 = new EvenimentBuilder("Fuego")
//				.setNrParticipanti(20).seteInterior(true).build();
//		System.out.println(eveniment2);
		
		// prototype
//		Eveniment eveniment1 = new Eveniment("Fuego", 1000, 1234.5f, true);
//		Eveniment eveniment2 = (Eveniment) eveniment1.copiaza();
//		System.out.println(eveniment1);
//		System.out.println(eveniment2);
		
		// adapter obiecte
//		Eveniment eveniment = new Eveniment("Fuego", 1000, 1234.5f, true);
//		AdapterSpatiuObiecte adapter = new AdapterSpatiuObiecte(eveniment);
//		adapter.inchiriazaSpatiu(eveniment.getDimensiuneLocatie());
		
		// adapter clase
//		AdapterSpatiuClase adapter = new AdapterSpatiuClase("Fuego", 1000, 1234.5f, true);
//		SpatiuAbstract spatiu = adapter;
//		spatiu.inchiriazaSpatiu();
		
		//facade
//		Eveniment eveniment = new Eveniment("Fuego", 1000, 1234.5f, true);
//		if (Facade.esteEligibil(eveniment)) {
//			System.out.println("Eveniment mare in interior");
//		} else {
//			System.out.println("Alt tip de eveniment");
//		}
		
		// proxy
//		Eveniment eveniment = new Eveniment();		
//		eveniment.participanti(TipEveniment.TEATRU, 100);
//		
//		Proxy proxy = new Proxy(eveniment);
//		proxy.participanti(TipEveniment.TEATRU, 250);
//		proxy.participanti(TipEveniment.CONCERT, 150);
		
		// composite
//		ComponentaMeniu organizator = new Eveniment("UNTOLD", 3000, 1334.5f, true);
//		ComponentaMeniu eveniment1 = new Eveniment("Fuego", 1000, 1234.5f, true);
//		ComponentaMeniu eveniment2 = new Eveniment("Puya", 2000, 2234.5f, false);
//		ComponentaMeniu participant1 = new Participant("Ion");
//		ComponentaMeniu participant2 = new Participant("Vasile");
//		ComponentaMeniu participant3 = new Participant("Andrei");
//		
//		eveniment1.adaugaNod(participant1);
//		eveniment1.adaugaNod(participant2);
//		
//		eveniment2.adaugaNod(participant3);
//		
//		organizator.adaugaNod(eveniment1);
//		organizator.adaugaNod(eveniment2);
//		organizator.printeaza();
		
		// decorator
//		EvenimentAbstract eveniment1 = new Eveniment("Fuego", 1000, 1234.5f, true);
//		eveniment1.printeaza();
//		System.out.println();
//		DecoratorAbstract decorator1= new DecoratorLMA(eveniment1);
//		decorator1.printeazaFelicitare();
//		decorator1.printeaza();
		
		// flyweight
//		Eveniment e1 = new Eveniment("Fuego", 1000, 1234.5f, true);		
//		FlyweightFactory fabrica = new FlyweightFactory();
//		fabrica.getEveniment("0722222222").printeazaEveniment(e1);
		
		// strategy
//		Portofel portofel = new Portofel(300);
//		Participant participant = new Participant(portofel, "Gabi");		
//		participant.platesteNota(200);
//		participant.setStrategie(new Card());
//		participant.platesteNota(110);
//		participant.setStrategie(portofel);
//		participant.platesteNota(200);
		
		// chain
//		Cont economii = new ContEconomii(100);
//		Cont curent = new ContCurent(400);
//		Cont credit = new ContCredit(300);		
//		curent.setSuccesor(economii);
//		economii.setSuccesor(credit);
//		curent.plateste(99);
//		curent.plateste(300);
//		curent.plateste(350);
		
		// command
//		ContBancar cont = new ContBancar("Ion");
//		ManagerComenzi manager = new ManagerComenzi();
//		
//		manager.invoca(new ComandaConstituire(cont, 100));
//		manager.invoca(new ComandaDepunere(cont, 200));
//		manager.executaComanda();
//		manager.invoca(new ComandaRetragere(cont, 250));
//		manager.executaComanda();
//		manager.executaComanda();
//		manager.invoca(new ComandaRetragere(cont, 350));
//		manager.executaComanda();
		
		// state
//		Masa masa = new Masa(3);
//		masa.elibereazaMasa();
//		masa.rezervaMasa();
//		masa.rezervaMasa();
//		masa.ocupaMasa();
//		masa.elibereazaMasa();
		
		// memento
//		MeciJucat meci = new MeciJucat("Steaua", "Rapid", 100, 100, 20, 500);		
//		ManagerMemento manager = new ManagerMemento();
//		manager.adaugaMemento(meci.creareMemento());
//		System.out.println(meci);		
//		meci.setNumeGazda("Dinamo");
//		meci.setNumeOaspeti("Craiova");
//		meci.setNrSpectatori(50);		
//		manager.adaugaMemento(meci.creareMemento());
//		System.out.println(meci);	
//		meci.setMemento(manager.getMemento(0));
//		System.out.println(meci);
		
		// observer
//		ManagerSala manager = new ManagerSala();		
//		Observer client1 = new Client("Gabi");
//		Observer client2 = new Client("Victor");
//		Observer client3 = new Client("Roberta");		
//		manager.adaugareAbonat(client1);
//		manager.adaugareAbonat(client2);
//		manager.adaugareAbonat(client3);		
//		manager.trimiteAnuntImportant("fotbal");
//		manager.trimiteAnuntImportant("volei");
//		manager.stergereAbonat(client3);
//		manager.trimiteAnuntImportant("handbal");
		
		// template
//		Spectator spectator = new Spectator("Gabi");		
//		spectator.intrarePeStadion();
		////////////////////////////////////////////
	}

}
