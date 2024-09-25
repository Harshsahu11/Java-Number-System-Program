// Operation:-add,get,modify,delete,iterate
import java.util.ArrayList;
import java.util.Collections;


public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
      //  ArrayList<String> list2=new ArrayList<String>();
      // ArrayList<Boolean> list3=new ArrayList<Boolean>();

      list.add(0);
      list.add(1);
      list.add(2);
      System.out.println(list);

      //get elements
      int element=list.get(0);
      System.out.println(element);

      //add element in between
      list.add(1,4);
      System.out.println(list);

      //Set element
      list.set(0,9);
      System.out.println(list);

      //delete element
      list.remove(3);
      System.out.println(list);

      //size
        int size=list.size();
        System.out.println(size);

      //loops
      for(int i=0;i<list.size();i++)
      {
        System.out.println(list.get(i));
      }

      // Sorting
      Collections.sort(list);
      System.out.println(list);



    }
}
