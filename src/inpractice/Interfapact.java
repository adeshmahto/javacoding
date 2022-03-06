package inpractice;

interface Tvremote{
	public void offbutton() ;
	public void onbutton() ;
}
interface smartTvremote extends Tvremote{
	public void automaticoff();			
}
class tv implements smartTvremote{
	public void offbutton() {
		System.out.println("off the tv");
	}
	public void onbutton() {
		System.out.println("on the tv");
		
	}
	public void automaticoff() {
		System.out.println("off the tv automatically");
		
	}
}

public class Interfapact {

	public static void main(String[] args) {

tv s= new smartTvremote();
s.offbutton();

	}

}
