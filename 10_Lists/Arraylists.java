import java.util.ArrayList;
import java.util.Collections;

public class Arraylists {
    public static void main (String args[]){
        ArrayList<Integer> list1 = new ArrayList<Integer>(); //For arraylist of integers
        ArrayList<String> list2 = new ArrayList<String>(); //For arraylist of String
        ArrayList<Boolean> list3 = new ArrayList<Boolean>(); //For arraylist of Boolean


        //add elements
        list1.add(10);
        list1.add(12);
        list1.add(13);

        System.out.println(list1);
    
    
        //get elements 
        int element = list1.get(0);
        System.out.println(element);



        //add elements in between
        list1.add(1,11);
        System.out.println(list1);


        //set element
        list1.set(0,5);
        System.out.println(list1);



        //delete element
        list1.remove(0);
        System.out.println(list1);




        //size
        int size = list1.size();
        System.out.println(size);




        //loops
        for(int i=0;i<list1.size();i++){
            System.out.print(list1.get(i)+" ");
        }
        System.out.println();




        //sorting
        Collections.sort(list1);
        System.out.println(list1);
    }
}
