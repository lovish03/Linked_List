public class LinkedListClient {
    public static void main(String[] args) {
           LinkedList<Integer> linkedList = new LinkedList<Integer>(); 
           
           linkedList.insert(11);
           linkedList.insert(33);
           linkedList.insert(22);
           linkedList.insert(14);
           linkedList.insert(39);
 
           linkedList.displayLinkedList(); 
                        
           System.out.print("Deleted Nodes: ");
           Node<Integer> deletedNode = linkedList.delete();  
           deletedNode.displayNode();                                 
           deletedNode = linkedList.delete();      
           deletedNode.displayNode();                                 
           
           System.out.println();
           linkedList.displayLinkedList();   
 
    }
  }
