
public class Prenotazione {
	private int n_bagagli;
	private double peso_complessivo;
	public Prenotazione()
	{
		
	}
	public Prenotazione(int n_bagagli, double peso_complessivo)
	{
		this.n_bagagli=n_bagagli;
		this.peso_complessivo=peso_complessivo;
	}
	public Prenotazione(Prenotazione p)
	{
		this.n_bagagli=p.n_bagagli;
		this.peso_complessivo=p.peso_complessivo;
	}
	public int getN_bagagli() {
		return n_bagagli;
	}
	public void setN_bagagli(int n_bagagli) {
		this.n_bagagli = n_bagagli;
	}
	public double getPeso_complessivo() {
		return peso_complessivo;
	}
	public void setPeso_complessivo(double peso_complessivo) {
		this.peso_complessivo = peso_complessivo;
	}
	public String toString()
	{
		return "Numero dei bagagli: "+n_bagagli+"\nPeso complessivo dei bagagli: "+peso_complessivo;
	}
}
