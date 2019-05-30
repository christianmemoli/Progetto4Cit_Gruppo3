package application;

import java.util.ArrayList;
import java.util.Iterator;

public class Prenotazioni extends SomethingException{ //ESTENDE ECCEZZIONE?
	public final static int NUM_MAX_P = 1000000;
	private ArrayList<Prenotazione>p;

	public Prenotazioni()
	{
		p = new ArrayList<>(NUM_MAX_P);
	}

	public void addPrenotazione(Prenotazione prenotazione) throws SomethingException
	{
		if(p.size()>=NUM_MAX_P)
		{
			throw new SomethingException();
		}
		p.add(prenotazione);
	}
	public void eliminaPrenotazione(String prenotazione) throws SomethingException
	{
		Iterator<Prenotazione>i;
		for(i=p.iterator(); i.hasNext();)
		{
			Prenotazione prenot = i.next();
			if(prenot.getCodice_prenotazione().equals(prenotazione))
			{
				i.remove();
				return;
			}
		}
		throw new SomethingException();
	}
	public Prenotazione cercaPrenotazioneNome(String nome) throws SomethingException 
	{
		for(Prenotazione prenotazione:p)
		{
			if(prenotazione.getNome().equals(nome))
			{
				return prenotazione;
			}
		}
		return null;
	}
}