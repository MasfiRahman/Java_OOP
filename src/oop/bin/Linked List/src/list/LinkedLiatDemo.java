package list;
import java.util.LinkedList;
public class LinkedLiatDemo {

	public static void main(String[] args) {
		
		LinkedList<String>countryNames = new LinkedList<String>();
        countryNames.add("Bangladesh");
        countryNames.add("India");
        countryNames.add("Pakistan");
        countryNames.add("Nepal");
        countryNames.add(4,"Afganistan");
        countryNames.addFirst("Saudia Arabia");
        countryNames.addLast("Oman");
        //countryNames.remove("Oman");
       // countryNames.remove(6);
        //countryNames.removeFirst();
        //countryNames.removeLast();
        System.out.println("Last element : "+countryNames.getLast());
        System.out.println("First element : "+countryNames.getFirst());
        countryNames.clear();
        System.out.println(countryNames);
        //for(String country : countryNames){
          // System.out.println(country);
        //}
        System.out.println("Size of the LinkedList : "+countryNames.size());
	}

}
