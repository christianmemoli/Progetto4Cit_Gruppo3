package application;
import java.util.HashMap;

public class LogIn {
	final static int NUM_MAX_ACCOUNT=10000000;
	HashMap<String, Dati>d;
	
	public LogIn()
	{
		d=new HashMap<String, Dati>(NUM_MAX_ACCOUNT);
	}
	
}
