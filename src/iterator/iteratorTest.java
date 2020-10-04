package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class iteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     MyArrayList<Integer> list =  new MyArrayList<Integer>();
     list.add(5);
     list.add(7);
     list.add(8);
     list.add(9);
     System.out.println("size:"+list.size());
     MyIterator<Integer> it = list.iterator();
     list.remove(new Integer(9));
     list.remove(new Integer(7));
     list.remove(new Integer(8));
    while(it.hasNext())
    {
   	 System.out.println(it.next());
    }

	
    MyLinkedList<Integer> list1 =  new MyLinkedList<Integer>();
    list1.add(50);
    list1.add(70);
    list1.add(80);
    list1.add(90);
    list1.add(100);
    list1.add(110);
    System.out.println("size:"+list1.size());
    MyIterator<Integer> it1 = list1.iterator();
    list1.remove(80);
    list1.remove(110);
    list1.remove(110);
   while(it1.hasNext())
   {
  	 System.out.println(it1.next());
   }
   System.out.println("size:"+list1.size());
    
	}

}
