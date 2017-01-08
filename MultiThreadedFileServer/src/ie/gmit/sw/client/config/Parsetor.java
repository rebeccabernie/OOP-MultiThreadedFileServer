package ie.gmit.sw.client.config;

public class Parsetor {
	
	public static final String CONF = "conf.xml";
	private String username;
	private String host;
	private int port;
	private String dir;
	
	public Parsetor() {
		super();
	}
	
	// Getters & Setters
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getDir() {
		return dir;
	}
	public void setDir(String dir) {
		this.dir = dir;
	}
	
	@Override
	public String toString() {
		return "Parsetor [username=" + username + ", host=" + host + ", port=" + port + ", dir=" + dir + "]";
	}

}
