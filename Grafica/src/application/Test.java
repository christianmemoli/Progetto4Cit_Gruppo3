	public static void main(String[] args) throws SomethingException {
		// TODO Auto-generated method stub

		Cliente c1 = new Cliente();
		Volo v1 = new Volo();
		Clienti c = new Clienti();
		Voli v = new Voli();
		Prenotazione p1 = new Prenotazione();
		Prenotazioni p = new Prenotazioni();

		int scelta = 0;

		Scanner s1=new Scanner(System.in);

		do
		{
			System.out.println("Benvenuti nel menù a tendina della nostra agenzia di volo. Eseguire una scelta:");
			System.out.println("1-Per cliente;");
			System.out.println("2-Per volo;");
			System.out.println("3-Per prenotazione.");
			System.out.println("(PREMERE 4 PER USCIRE DAL MENU)");

			scelta=s1.nextInt();

			switch(scelta)
			{
			case 1:

					System.out.println("4-Cerca cliente a partire dal nome e cognome;");
					System.out.println("5-Modifica dati del cliente a partire dal codice;");
					System.out.println("(PREMERE 6 PER USCIRE DAL MENU)");

					scelta2=s2.nextInt();

					switch(scelta2)
					{
					case 1:

						Scanner s3=new Scanner(System.in);
						System.out.print("Nome: ");
						c1.setNome(s3.nextLine());
						c1.setData_nascita(s3.nextLine());
						System.out.print("Codice clietne: ");
						c1.setCodice_cliente(s3.nextLine());

						try
						{
							c.addCliente(c1);
							System.out.println(s);
						}
						break;

					case 2:

						Scanner s4=new Scanner(System.in);
						System.out.print("Inserire Il codice del cliente da eliminare: ");
				break;

				// DA CORREGGERE (PRENOTAZIONE)

			case 3:

				int scelta4=0;

				Scanner s4=new Scanner(System.in);

				do
				{
					System.out.println("Scegliere l'attività:");
					System.out.println("(PREMERE 4 PER USCIRE DAL MENU)");

					int scelta5;

					Scanner s5 = new Scanner(System.in);

					scelta5 = s5.nextInt();

					switch(scelta5)
					{
					case 1:
						Scanner s3 = new Scanner(System.in);
						System.out.print("Nome: ");
						p1.setNome(s3.nextLine());
						System.out.print("Codice prenotazione: "); // LO GENRIAMO AUTOMATICAMENTE?
						p1.setCodice_prenotazione(s3.nextLine());

						try
						{
							p.addPrenotazione(p1);

						}catch(SomethingException s)
						{
							System.out.println(s);
						}
						break;

					case 2:

						Scanner s6 = new Scanner(System.in);

						System.out.print("Inserire Il codice della prenotazione da eliminare: ");

						try
						{
							p.eliminaPrenotazione(s6.nextLine());
						}catch(SomethingException s)
						{
							System.out.println(s);
						}
						break;

					case 3:

						Scanner s8=new Scanner(System.in);

						System.out.print("Inserire il nome della prenotazione da cercare: ");

						try
						{
							System.out.println(p.cercaPrenotazioneNome(s8.nextLine()));

						}catch(SomethingException s)
						{
							System.out.println(s);
						}
						break;

					case 4:
						
					}
				}while(scelta4<=4);
				break;
			}
		}while(scelta<=3);
		System.out.println("Grazie per aver scelto la nostra compagnia.");
	}
}