package application;

public class Prenotazione {
	private int n_bagagli;
	private double peso_complessivo;

	private String nome;
	private String codice_prenotazione;

	public Prenotazione()
	{

	}
	public Prenotazione(int n_bagagli, double peso_complessivo, String nome, String codice_prenotazione)
	{
		this.n_bagagli=n_bagagli;
		this.peso_complessivo=peso_complessivo;
		this.nome = nome;
		this.codice_prenotazione = codice_prenotazione;
	}
	public Prenotazione(Prenotazione p)
	{
		
	}
		public void setPeso_complessivo(double peso_complessivo) {
			this.peso_complessivo = peso_complessivo;
		}

		public String getNome(){

			return nome;
		}
		public void setNome(String nome){

			this.nome = nome;
		}

		public String getCodice_prenotazione(){

			return codice_prenotazione;
		}
		public void setCodice_prenotazione(String codice_prenotazione){

			this.codice_prenotazione = codice_prenotazione;
		}

		public String toString()
		{
			return "Nome prenotazione: " + nome + "\nCodice Prenotazione: " + codice_prenotazione + "\nNumero dei bagagli: " + n_bagagli + "\nPeso complessivo dei bagagli: " +peso_complessivo;
		}
		
}