 import java.text.DecimalFormat;
public class DecimalFormatDemo{
    public static void main(String[] args) {
        
        DecimalFormat ob = new DecimalFormat("0.00");
        double x =2.87;
        System.out.println("X = "+ob.format(x));
    }
}
