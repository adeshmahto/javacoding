package method;

public class Method_r {

	static float avg(int ...arr) {
	float sum=0;
		float  Avg;
		for(int element:arr) {
			sum+=element;
		
			}
		Avg = sum/arr.length;
		
return Avg ; 
		}
	public static void main(String[] args) {

		
				System.out.println(avg(10,3,8,90));



	}

}
