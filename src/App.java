
import java.util.ArrayList; 
import java.util.Collections;
import java.util.Arrays;
import java.util.Iterator;
public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrlist = new ArrayList<String>();
        
      
         arrlist.add("SpiderWoman");
         arrlist.add("Spiderman");
         arrlist.add("Captain America");
         arrlist.add("Doctor Strange");
         arrlist.add("Daredevil");
         arrlist.add("Black Widow");
         
        arrlist.add("Super");

        arrlist.add("Batman");
        arrlist.add("Superman");
        arrlist.add("Iron-Man");
      
        

       

         
         arrlist.add("Black widow");
         arrlist.add(1,"Iron-Man");
         arrlist.add(2, "Hulk");


         arrlist.remove("Hulk");
         arrlist.remove(2);

         
         arrlist.set(1,"Spider-Woman");
         arrlist.set(2,"Hulk");
         arrlist.get(2);
         

         
         Collections.sort(arrlist);
         Collections.sort(arrlist, Collections.reverseOrder());

         if(arrlist.contains("Spiderman")){
            System.out.println("Spiderman is in the list");
        } else {
            System.out.println("Spiderman is not in the list");
        }
        System.out.println(arrlist.get(2));
        System.out.println(arrlist);
        System.out.println(arrlist.size());


        for(int i=0; i<arrlist.size(); i++) {
            System.out.println(arrlist.get(i));
        }
        ArrayList<String> name = new ArrayList<String>();

     
        Iterator<String> it = name.iterator();


        while(it.hasNext()){
            System.out.println(it.next() + " ");
        }

        ArrayList<String> Names = new ArrayList<String>();
        String []  names = {"John", "Mary", "Jane","Bob","Cathy"};
        Arrays.sort(names);
        System.out.println( Names);
    }
}















