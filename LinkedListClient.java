import java.util.*;
public class LinkedListClient 
{
    public static void main(String[] args) 
    {
           LinkedList<Integer> linkedList = new LinkedList<Integer>(); 
           System.out.println("LinkedList is");
           linkedList.insert(11);
           linkedList.insert(33);
           linkedList.insert(22);
           linkedList.insert(14);
           linkedList.insert(39);
           System.out.println("Size of LinkedList is:"+linkedList.size());

           for(Iterator itr=linkedList.iterator();itr.hasNext();)
           {
            System.out.println(itr.next());
           }
          System.out.println("Size of LinkedList after deletion:"+linkedList.size());

           linkedList.deleteFirst();
           linkedList.deleteLast();
           System.out.println("Size of LinkedList is:"+linkedList.size());

           for(Iterator itr=linkedList.iterator();itr.hasNext();)
           {
            System.out.println(itr.next());
           }
    }
}
