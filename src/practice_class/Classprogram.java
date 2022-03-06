package practice_class;


interface Mcamera{
	void takeSnap();
	void recordVideo();
	
	}
interface Mwifi{
	String[] getNetworks();
	
	void connectToNetwork(String network);
}

class mycellphone{
	void callNumber(int phoneNumber) {
		System.out.println("calling"+phoneNumber);
	}
 
}
class smartphone extends mycellphone implements Mwifi,Mcamera{
	public void takeSnap() {
		System.out.println("taking pic");
	}
	public void recordVideo() {
		System.out.println("taking video");
	}
	
	public void connectToNetwork(String network) {
		System.out.println("connecting"+ network);
		
		
	}

	public String[] getNetworks() {
		String[] networkList= {"harry","shubham","adesh"};
		return networkList;
	}


	
}

public class Classprogram {

	public static void main(String[] args) {
		

	}

}
