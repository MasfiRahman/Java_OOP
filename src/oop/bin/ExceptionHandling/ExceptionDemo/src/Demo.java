import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int count = 1;
        do{
            try{
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a num1 : ");
                int num1 = sc.nextInt();
                System.out.print("Enter a num2 : ");
                int num2 = sc.nextInt();
                int result = num1/num2;
                System.out.println("Result : "+ num1 + "/" + num2 + "="+ result);
            count=2;
            }catch(Exception e){
              System.out.println("Exception : "+e);
              System.out.println("You must enter integer . Please try again");
            }
        }while(count==1);
    }
}
