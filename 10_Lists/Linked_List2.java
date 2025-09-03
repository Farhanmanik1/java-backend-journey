import java.util.*;

class LL{

}
public class Linked_List2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);
        
        list.addFirst("this");
        list.add("list");
        System.out.println(list);

        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" -> ");
        }
        System.out.println("null");
        
        list.remove(2);

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" -> ");
        }
        System.out.println("null");
    }
}
