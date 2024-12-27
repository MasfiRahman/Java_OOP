package referencevalue;

public class CallByReferenceTest {

	public static void main(String[] args) {
		
		CallByReference rf1 = new CallByReference();
		rf1.name = "Masfi";
		System.out.println("Before Calling = "+rf1.name);
		
		rf1.change(rf1);
		System.out.println("After Calling = "+rf1.name);
	}

}
