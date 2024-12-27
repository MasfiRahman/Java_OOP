package method_overloading;

public class MethodOverloadingTest {

	public static void main(String[] args) {
	
		Overload ov1 = new Overload();
		ov1.add();
		
		Overload ov2 = new Overload();
		ov2.add(5,10);
		
		Overload ov3 = new Overload();
		ov3.add(3.45,67.8);
		
		Overload ov4 = new Overload();
		ov4.add(5,7,54);
		
	}

}
