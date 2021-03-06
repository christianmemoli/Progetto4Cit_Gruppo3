package application;
import java.util.ArrayList;
import java.util.Iterator;

public class Clienti extends SomethingException{
	public final static int NUM_MAX_CLIENTI=1000000;
	private ArrayList<Cliente>c;
	
	public Clienti()
	{
		c=new ArrayList<>(NUM_MAX_CLIENTI);
	}
	
	public void addCliente(Cliente cliente) throws SomethingException
	{
		if(c.size()>=NUM_MAX_CLIENTI)
		{
			throw new SomethingException();
		}
		c.add(cliente);
	}
	public void eliminaCliente(String codice)throws SomethingException
	{
		Iterator<Cliente>i;
		for(i=c.iterator(); i.hasNext();)
		{
			Cliente cliente= i.next();
			if(cliente.getCodice_cliente().equals(codice))
			{
				i.remove();
				return;
			}
		}
		throw new SomethingException();
	}
	public Cliente cercaClienteCodice(String codice)throws SomethingException
	{
		for(Cliente cliente:c)
		{
			if(cliente.getCodice_cliente().equals(codice))
			{
				return cliente;
			}
		}
		return null;
	}
	public Cliente cercaClienteNomeCognome(String nome, String cognome)throws SomethingException
	{
		for(Cliente cliente:c)
		{
			if(cliente.getNome().equals(nome) && cliente.getCognome().equals(cognome))
			{
				return cliente;
			}
		}
		return null;
	}
	public Cliente modificaCliente(String codice)throws SomethingException
	{
		for(Cliente cliente:c)
		{
			if(cliente.getCodice_cliente().equals(codice))
			{
				
			}
		}
		return null;
	}
}
