public class Comparison {
    public static void main(String[] args) {
        String Password1 = "mas123";
        String Password2 = "mas123";
        String Password3 = new String("mas123");
        String Password4 = new String("mas123");
/*        
           //primitive wise
        System.out.println(Password1==Password2);
        System.out.println(Password1==Password3);
        System.out.println(Password3==Password4);
 */   

          //Object wise 
         System.out.println(Password1.equals(Password2));
         System.out.println(Password1.equals(Password3));
         System.out.println(Password3.equals(Password4));    
    }
}
