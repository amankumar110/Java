
public class Main {

	public static void main(String[] args) {
		
		// 1 to many
		Application apps[] = new Application[10];
		//Not compatible with current version of software
		apps[0] = new Application("Candy Crush","windows",2048,11);
		//Not compatible with OS
		apps[1] = new Application("facebook by META","windows",20000,7);
		//Memory is not free and appManager is impartial , It will say no memory is available.
		//If you want to download one make another array of Application with one Application.
		apps[2] = new Application("Grand Theft Auto:V","windows",1024*2000,8);
		
		// 1 to 1
		Os windows = new Os(10.1,"windows");
		
		// 1 to 1
		Computer myCom = new Computer(8, 256_000, windows, apps);
		System.out.println("Storage Left is "+myCom.getFreeSpace()+" out of "+myCom.getRom()+"mbs");
	}

}
