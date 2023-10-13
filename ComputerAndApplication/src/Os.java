
public class Os {
	
	private int storage = 7000;
	private double version;
	private String osName;
	
	public Os(double version, String osName) {
			
		this.version=version;
		this.osName=osName;
	}

	public int getStorage() {
		return storage;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public String getOsName() {
		return osName;
	}

	public void setOsName(String osName) {
		if(osName.toLowerCase().equals("windows") && osName.toLowerCase().equals("macos") || osName.toLowerCase().equals("linux"))
			this.osName = osName;
	}
	
	
}
