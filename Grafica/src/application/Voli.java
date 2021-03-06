package application;
import java.util.Date;
import java.util.HashMap;

public class Voli extends SomethingException{
	final static int NUM_MAX_VOLI=1000000;
	HashMap<String, Volo>v;
	public Voli()
	{
		v=new HashMap<String, Volo>(NUM_MAX_VOLI);
	}
	
	public void addVolo(Volo volo) throws SomethingException
	{
		if(v.size()>=NUM_MAX_VOLI)
		{
			throw new SomethingException();
		}
		v.put(volo.getCodice_volo(), volo);
	}
	public void removeVolo(String codice)throws SomethingException
	{
		for(Volo volo:v.values())
		{
			if(volo.getCodice_volo().equals(codice))
			{
				v.remove(codice);
			}
		}
		throw new SomethingException();
	}
	public Volo cercaVoloCodice(String codice)throws SomethingException
	{
		for(Volo volo:v.values())
		{
			if(volo.getCodice_volo().equals(codice))
			{
				return volo;
			}
		}
		return null;
	}
	public Volo cercaVoloByInfo(String data, String aeroportoPartenza, String aeroportoArrivo, double oraPartenza)throws SomethingException
	{
		for(Volo volo:v.values())
		{
			if((volo.getData_volo().equals(data)) && (volo.getAeroporto_partenza().equals(aeroportoPartenza)) && (volo.getAeroporto_arrivo().equals(aeroportoArrivo)) && (volo.getOra_partenza()==oraPartenza))
			{
				return volo;
			}
		}
		return null;
	}
}
