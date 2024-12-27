public class Car extends Vechile {
    //colour,weight,attribute()
    int gear;

    Car(String c,double w,int g){
        super(c,w);
        gear = g;
    }
    @Override
    void attribute(){
        super.attribute();
        System.out.println("Gear : "+gear);
    }
}
