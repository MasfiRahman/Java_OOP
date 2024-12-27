public class University {
    final String University_Name = "UAP";
    static final int fees;//static blank final variable

    static{
        fees=16875;
    }

    void display(){
        System.out.println(University_Name);
        System.out.println(fees);
    }
}
