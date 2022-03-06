package vectorandstack;

public class Arrstack {

	public static void main(String[] args) {
	
		Myarrstack st=new Myarrstack();
		
		st.push(45);
		st.push(45);
		st.push(45);
		st.push(45);
	
		int popped =st.pop();
		System.out.println(popped);

	}

}
