public class FactorialTest {
    public static void main(String[] args) {
        FactorialDemo f1 = new FactorialDemo();
        int result = f1.fact(5);
        System.out.println("Result : "+result);

        int result2 = f1.fact(6);
        System.out.println("Result : "+result2);

        int result3 = f1.fact(1);
        System.out.println("Result : "+result3);
    }
}
