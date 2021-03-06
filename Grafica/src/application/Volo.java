package application;
import java.util.Date;

public class Volo {
    private String codice_volo;
    private String aeroporto_partenza;
    private String aeroporto_arrivo;
    private String data_volo;
    private double ora_partenza;
    private double ora_arrivo;
    private int numero_posti;
    private double costo_volo;
    
    public Volo()
    {
    	
    }
    public Volo(String codice_volo, String aeroporto_partenza, String aeroporto_arrivo, String data_volo, double ora_partenza, double ora_arrivo, int numero_posti,double costo_volo)
    {
    	this.codice_volo=codice_volo;
    	this.aeroporto_partenza=aeroporto_partenza;
    	this.aeroporto_arrivo=aeroporto_arrivo;
    	this.data_volo=data_volo;
    	this.ora_partenza=ora_partenza;
    	this.ora_arrivo=ora_arrivo;
    	this.numero_posti=numero_posti;
    	this.costo_volo=costo_volo;
    }
    public Volo(Volo v)
    {
    	this.codice_volo=v.codice_volo;
    	this.aeroporto_partenza=v.aeroporto_partenza;
    	this.aeroporto_arrivo=v.aeroporto_arrivo;
    	this.data_volo=v.data_volo;
    	this.ora_partenza=v.ora_partenza;
    	this.ora_arrivo=v.ora_arrivo;
    	this.numero_posti=v.numero_posti;
    	this.costo_volo=v.costo_volo;
    }
	public String getCodice_volo() {
		return codice_volo;
	}
	public void setCodice_volo(String codice_volo) {
		this.codice_volo = codice_volo;
	}
	public String getAeroporto_partenza() {
		return aeroporto_partenza;
	}
	public void setAeroporto_partenza(String aeroporto_partenza) {
		this.aeroporto_partenza = aeroporto_partenza;
	}
	public String getAeroporto_arrivo() {
		return aeroporto_arrivo;
	}
	public void setAeroporto_arrivo(String aeroporto_arrivo) {
		this.aeroporto_arrivo = aeroporto_arrivo;
	}
	public String getData_volo() {
		return data_volo;
	}
	public void setData_volo(String data_volo) {
		this.data_volo = data_volo;
	}
	public double getOra_partenza() {
		return ora_partenza;
	}
	public void setOra_partenza(double ora_partenza) {
		this.ora_partenza = ora_partenza;
	}
	public double getOra_arrivo() {
		return ora_arrivo;
	}
	public void setOra_arrivo(double ora_arrivo) {
		this.ora_arrivo = ora_arrivo;
	}
	public int getNumero_posti() {
		return numero_posti;
	}
	public void setNumero_posti(int numero_posti) {
		this.numero_posti = numero_posti;
	}
	public double getCosto_volo() {
		return costo_volo;
	}
	public void setCosto_volo(double costo_volo) {
		this.costo_volo = costo_volo;
	}
	public String toString()
	{
		return "Codice del volo: "+codice_volo+".\nAeroporto di partenza: "+aeroporto_partenza+".\nAeroporto di arrivo: "+aeroporto_arrivo+".\nData del volo: "+data_volo+".\nOra di partenza: "+ora_partenza+".\nOra Arrivo: "+ora_arrivo+".\nNumero dei posti: "+numero_posti+".\nCosto volo: "+costo_volo; 
	}
}
