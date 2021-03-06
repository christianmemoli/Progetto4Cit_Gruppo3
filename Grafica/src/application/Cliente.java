package application;


public class Cliente {
    private String cognome;
    private String nome;
    private String nazione_nascita;
    private String citta_nascita;
    private String data_nascita;
    private String codice_cliente;
    
    public Cliente()
    {
    	
    }
    public Cliente(String cognome, String nome, String nazione_nascita, String citta_nascita, String data_nascita, String codice_cliente)
    {
    	this.cognome=cognome;
        this.nome=nome;
        this.nazione_nascita=nazione_nascita;
        this.citta_nascita=citta_nascita;
        this.data_nascita=data_nascita;
        this.codice_cliente=codice_cliente;
    }
    public Cliente(Cliente c)
    {
    	this.cognome=c.cognome;
        this.nome=c.nome;
        this.nazione_nascita=c.nazione_nascita;
        this.citta_nascita=c.citta_nascita;
        this.data_nascita=c.data_nascita;
        this.codice_cliente=c.codice_cliente;
    }
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNazione_nascita() {
		return nazione_nascita;
	}
	public void setNazione_nascita(String nazione_nascita) {
		this.nazione_nascita = nazione_nascita;
	}
	public String getCitta_nascita() {
		return citta_nascita;
	}
	public void setCitta_nascita(String citta_nascita) {
		this.citta_nascita = citta_nascita;
	}
	public String getData_nascita() {
		return data_nascita;
	}
	public void setData_nascita(String data_nascita) {
		this.data_nascita = data_nascita;
	}
	public String getCodice_cliente() {
		return codice_cliente;
	}
	public void setCodice_cliente(String codice_cliente) {
		this.codice_cliente = codice_cliente;
	}
	public String toString()
	{
		return "Cognome: "+cognome+".\nNome: "+nome+".\nNazione di nascita: "+nazione_nascita+".\nCitta di nascita: "+citta_nascita+".\nData di nascita: "+data_nascita+".\nCodice del cliente: "+codice_cliente;
	}
}
