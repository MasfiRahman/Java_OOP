public class Rectengale extends Shape {
    //area
     double length,width;

     Rectengale(double length,double width){
         this.length=length;
         this.width=width;
     }


    double area(){
        System.out.println("Area for Rectengale");
            return length*width;
    }
}
