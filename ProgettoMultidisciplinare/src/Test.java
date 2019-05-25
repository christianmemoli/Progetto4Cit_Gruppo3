import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws SomethingException {
		// TODO Auto-generated method stub
		Cliente c1=new Cliente();
		Volo v1=new Volo();
		Clienti c=new Clienti();
		Voli v=new Voli();
		int scelta=0;
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
				int scelta2=0;
				Scanner s2=new Scanner(System.in);
				do
				{
					System.out.println("Scegliere l'attività:");
					System.out.println("1-Aggiunta cliente;");
					System.out.println("2-Elimina cliente dal codice;");
					System.out.println("3-Cerca cliente a partire dal codice;");
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
						System.out.print("Cognome: ");
						c1.setCognome(s3.nextLine());
						System.out.print("Nazione di nascita: ");
						c1.setNazione_nascita(s3.nextLine());
						System.out.print("Città di nascita: ");
						c1.setCitta_nascita(s3.nextLine());;
						System.out.print("Data di nascita: ");
						c1.setData_nascita(s3.nextLine());
						System.out.print("Codice clietne: ");
						c1.setCodice_cliente(s3.nextLine());
						try
						{
							c.addCliente(c1);
						}catch(SomethingException s)
						{
							System.out.println(s);
						}
						break;
					case 2:
						Scanner s4=new Scanner(System.in);
						System.out.print("Inserire Il codice del cliente da eliminare: ");
						try
						{
							c.eliminaCliente(s4.nextLine());
						}catch(SomethingException s)
						{
							System.out.println(s);
						}
						break;
					case 3:
						Scanner s5=new Scanner(System.in);
						System.out.print("Inserire Il codice del cliente da cercare: ");
						try
						{
							System.out.println(c.cercaClienteCodice(s5.nextLine()));
						}catch(SomethingException s)
						{
							System.out.println(s);
						}
						break;
					case 4:
						Scanner s6=new Scanner(System.in);
						System.out.print("Inserire Il nome e il cognome del cliente da cercare: ");
						try
						{
							System.out.println(c.cercaClienteNomeCognome(s6.nextLine(), s6.nextLine()));
						}catch(SomethingException s)
						{
							System.out.println(s);
						}
						break;
					case 5:
						
					}
				}while(scelta2<=5);
				break;
			case 2:
				int scelta3=0;
				Scanner s7=new Scanner(System.in);
				do
				{
					System.out.println("Scegliere l'attività:");
					System.out.println("1-Aggiunta volo;");
					System.out.println("2-Elimina volo dal codice;");
					System.out.println("3-Cerca volo a partire dal codice;");
					System.out.println("4-Cerca volo a partire dalle seguenti informazioni(data, aeroporto partenza, aeroporto arrivo, ora partenza);");
					System.out.println("(PREMERE 6 PER USCIRE DAL MENU)");
					scelta3=s7.nextInt();
					switch(scelta3)
					{
					case 1:
						Scanner s8=new Scanner(System.in);
						System.out.print("Codice volo: ");
						v1.setCodice_volo(s8.nextLine());
						System.out.print("Aeroporto di partenza: ");
						v1.setAeroporto_partenza(s8.nextLine());
						System.out.print("Aeroporto di arrivo: ");
						v1.setAeroporto_arrivo(s8.nextLine());
						System.out.print("Data del volo: ");
						v1.setData_volo(s8.nextLine());
						System.out.print("Ora di partenza: ");
						v1.setOra_partenza(s8.nextDouble());
						System.out.print("Ora di arrivo: ");
						v1.setOra_arrivo(s8.nextDouble());
						System.out.print("Numero dei posti: ");
						v1.setNumero_posti(s8.nextInt());
						System.out.print("Costo del volo: ");
						v1.setCosto_volo(s8.nextDouble());
						try
						{
							v.addVolo(v1);
						}catch(SomethingException s)
						{
							System.out.println(s);
						}
						break;
					case 2:
						Scanner s9=new Scanner(System.in);
						System.out.print("Inserire Il codice del volo da eliminare: ");
						try
						{
							v.removeVolo(s9.nextLine());
						}catch(SomethingException s)
						{
							System.out.println(s);
						}
						break;
					case 3:
						Scanner s10=new Scanner(System.in);
						System.out.print("Inserire Il codice del volo da cercare: ");
						try
						{
							System.out.println(v.cercaVoloCodice(s10.nextLine()));
						}catch(SomethingException s)
						{
							System.out.println(s);
						}
						break;
					case 4:
						Scanner s11=new Scanner(System.in);
						System.out.print("Inserire le informazion, per le quali cercare in volo: ");
						System.out.println("(INSERIRE NEL SEGUENTE ORDINE:\nDATA DEL VOLO;\nAEROPORTO DI PARTENZA;\nAEROPORTO DI ARRIVO;\nORA DI PARTENZA.");
						try
						{
							System.out.println(v.cercaVoloByInfo(s11.nextLine(), s11.nextLine(), s11.nextLine(), s11.nextDouble()));
						}catch(SomethingException s)
						{
							System.out.println(s);
						}
						break;
					}
				}while(scelta3<=5);
				break;
				
				// DA CORREGGERE (PRENOTAZIONE)
				// CAMBIA TUTTO CON VARIABILI E METODI DI PRENOTAZIONI
			case 3:
				int scelta4=0;
				Scanner s4=new Scanner(System.in);
				do
				{
					System.out.println("Scegliere l'attività:");
					System.out.println("1-Aggiunta prenotazione;");
					System.out.println("2-Elimina prenotazione dal codice volo;");
					System.out.println("3-Cerca prenotazione a partire dal nome;");
					System.out.println("(PREMERE 4 PER USCIRE DAL MENU)");
					
					int scelta5;
					Scanner s5=new Scanner(System.in);
					scelta5 =s5.nextInt();
					
					switch(scelta5)
					{
					case 1:
						Scanner s3=new Scanner(System.in);
						System.out.print("Nome: ");
						c1.setNome(s3.nextLine());
						System.out.print("Codice prenotazione: "); // LO GENRIAMO AUTOMATICAMENTE?
						c1.setCodice_cliente(s3.nextLine());
						try
						{
							c.addCliente(c1);
						}catch(SomethingException s)
						{
							System.out.println(s);
						}
						break;
					case 2:
						Scanner s6=new Scanner(System.in);
						System.out.print("Inserire Il codice del cliente da eliminare: ");
						try
						{
							c.eliminaCliente(s5.nextLine());
						}catch(SomethingException s)
						{
							System.out.println(s);
						}
						break;
					case 3:
						Scanner s8=new Scanner(System.in);
						System.out.print("Inserire Il codice del cliente da cercare: ");
						try
						{
							System.out.println(c.cercaClienteCodice(s8.nextLine()));
						}catch(SomethingException s)
						{
							System.out.println(s);
						}
						break;
					case 4:
						Scanner s9=new Scanner(System.in);
						System.out.print("Inserire Il nome e il cognome del cliente da cercare: ");
						try
						{
							System.out.println(c.cercaClienteNomeCognome(s9.nextLine(), s9.nextLine()));
						}catch(SomethingException s)
						{
							System.out.println(s);
						}
						break;
					case 5:
						
					}
				}while(scelta4<=5);
				break;
			}
		}while(scelta<=3);
		System.out.println("Grazie per aver scelto la nostra compagnia.");
	}

}
