
public class Computer {
	
	ApplicationManager applicationManager = new ApplicationManager();
		
	private int ram;
	private int rom;
	private Os os;
	private int appsInsatlled=0;
	private int freeSpace;
	// One to Many Has-A
	private Application apps[] = new Application[100];
	
	
	public Computer(int ram,int rom,String osName,double version,Application apps[]) {
		
		this.ram=ram;
		this.rom=rom;
		Os os = new Os(version,osName);
		this.os=os;
		freeSpace= this.rom - this.os.getStorage();
		
		this.checkMemory();

	}
	
	
	public Computer(int ram,int rom,Os os,Application apps[]) {
			
		this(ram,rom,os.getOsName(),os.getVersion(),apps);
	}
	
	
	// Methods
	
	public void checkMemory() {
		
		if(this.freeSpace - applicationManager.getSizeOf(apps) >= 350) 
			
			for(int i=0;apps[i]!=null;i++) 	{
				
				boolean status = this.installApplication(apps[i]);
		
				if(status) {
					freeSpace-=apps[i].getStorage();
					System.out.println(apps[i].getName()+" Was Insatlled");
				} else 
					System.out.println(apps[i].getName() + " was not compatible for " + this.os.getOsName() + " " + this.os.getVersion());
				
			}
		else
			System.out.println("Out Of Memory");
		
		
	}
	
	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getRom() {
		return rom;
	}

	public void setRom(int rom) {
		this.rom = rom;
	}

	public Os getOs() {
		return os;
	}

	public void setOs(Os os) {
		this.os = os;
	}

	public Application[] getApps() {
		return apps;
	}

	public void setApps(Application[] apps) {
		if(this.freeSpace - applicationManager.getSizeOf(apps) >=350)
			this.apps = apps;
	}

	public int getFreeSpace() {
		return freeSpace;
	}

	public void setFreeSpace(int freeSpace) {
		this.freeSpace = freeSpace;
	}
	
	
	public boolean installApplication(Application app) {
		
		if(applicationManager.isCompatible(app, os)) {
			
			apps[appsInsatlled] = app;
			appsInsatlled++;
			return true;
		}
		return false;
	}
	
	
	
	
	
}
