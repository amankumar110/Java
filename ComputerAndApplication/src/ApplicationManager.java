
public class ApplicationManager {
	
	public int getSizeOf(Application apps[]) {
		
		int totalSize = 0;
		
		for(int i=0;apps[i]!=null;i++)
			totalSize+=apps[i].getStorage();
		
		return totalSize;
	}
	
	public boolean isCompatible(Application app,Os os) {
		
		if(app.getSupportedOs().equals(os.getOsName()) && app.getSupportedOsVersion()<=os.getVersion()) 
			return true;
		
		return false;
	}
	
}
