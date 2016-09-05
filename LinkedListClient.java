import java.util.*;
public class LinkedListClient 
{
  public void iterate(LinkedList linkedList)
  {
    for(Iterator itr=linkedList.iterator();itr.hasNext();)
           {
            System.out.println(itr.next());
           }
  }

    public static void main(String[] args) 
    {
           LinkedListClient linkedListClient=new LinkedListClient();
           LinkedList<Integer> linkedList = new LinkedList<Integer>(); 
           System.out.println("LinkedList is");
           linkedList.insert(11);
           linkedList.insert(33);
           linkedList.insert(22);
           linkedList.insert(14);
           linkedList.insert(39);
           linkedListClient.iterate(linkedList);
          System.out.println("Size of LinkedList is:"+linkedList.size());

          System.out.println("LinkedList after deletion:");
       
           linkedList.deleteFirst();
           linkedList.deleteLast();
          linkedListClient.iterate(linkedList);

           System.out.println("Size of LinkedList is:"+linkedList.size());

          
    }
}
