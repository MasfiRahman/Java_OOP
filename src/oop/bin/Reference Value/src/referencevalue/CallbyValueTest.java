package referencevalue;

public class CallbyValueTest {

	public static void main(String[] args) {
	
		CallbyValue ob = new CallbyValue();
		int x = 10;//primitive parameter
		System.out.println("Before Calling : "+x);
		
		ob.change(x);
		System.out.println("After Calling : "+x);
	}

}
