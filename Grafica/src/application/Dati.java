package application;

public class Dati {
	protected String username;
	protected String password;
	public Dati()
	{
		
	}
	public Dati(String username, String password)
	{
		this.username=username;
		this.password=password;
	}
	public Dati(Dati d)
	{
		this.username=d.username;
		this.password=d.password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
