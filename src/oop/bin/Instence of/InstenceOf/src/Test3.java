public class Test3 {
    public static void main(String[] args) {
        Animal a = new Animal();
        Person3 p3 = new Person3();
        Teacher3 t3 = new Teacher3();

        System.out.println( a instanceof Animal);
        System.out.println(p3 instanceof Animal);
        System.out.println(t3 instanceof Person3);
        System.out.println(t3 instanceof Animal);
        System.out.println(p3 instanceof Teacher3);
    }
}
