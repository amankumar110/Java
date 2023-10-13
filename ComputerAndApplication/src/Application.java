
public class Application {
	
	private String name;
	private String supportedOs;
	private int storage;
	private double supportedOsVersion;
	
	public Application(String name,String supportedOs,int storage,double supportedOsVersion) {
		
		this.name=name;
		this.supportedOs=supportedOs.toLowerCase();
		this.storage=storage;
		this.supportedOsVersion=supportedOsVersion;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSupportedOs() {
		return supportedOs;
	}

	public void setSupportedOs(String supportedOs) {
		this.supportedOs = supportedOs;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}


	public double getSupportedOsVersion() {
		return supportedOsVersion;
	}


	public void setSupportedOsVersion(double supportedOsVersion) {
		this.supportedOsVersion = supportedOsVersion;
	}
	
	
}
