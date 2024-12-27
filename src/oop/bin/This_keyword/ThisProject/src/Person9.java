public class Person9 {
    String name;
    int age;
    String haircolour;

    Person9(String name,int age){
        this.name = name;
        this.age = age;
    }
    Person9(String name,int age,String haircolour){
        this(name,age);
        this.haircolour= haircolour;
    }
    void display(){
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
        System.out.println("Haircolour = "+haircolour);
    }
} 
