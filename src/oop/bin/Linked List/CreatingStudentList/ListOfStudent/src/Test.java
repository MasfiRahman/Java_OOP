import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<Student>list = new LinkedList<Student>();

        //creating Student List
        Student s1 = new Student("Masfi","Second", 182);
        Student s2 = new Student("Mahi", "Second", 186);
        Student s3 = new Student("Robayet", "Second", 189);
       
        //adding Student
        list.add(s1);
        list.add(s2);
        list.add(s3);


        //Display Information
        for(Student s : list){
            System.out.println("Name : "+s.name);
            System.out.println("ClassName : "+s.className);
            System.out.println("ID : "+s.id);
        }
    }
}
