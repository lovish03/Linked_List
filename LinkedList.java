class LinkedList<T> {

    private Node<T> first; 
 
    public LinkedList(){
           first = null;
    }
 
    public void insert(T data) {
           Node<T> newNode = new Node<T>(data);  
           newNode.next = first;   
           first = newNode;  
    }
 
    public Node<T> delete()
    {
           if(first==null){                
                  System.out.println("LinkedList doesn't contain any Nodes.");
           }
           Node<T> tempNode = first; 
           first = first.next; 
           return tempNode; 
    }
    
  
    public void displayLinkedList() {
           System.out.print("Displaying LinkedList ");
           Node<T> tempDisplay = first;  
           while (tempDisplay != null){ 
                  tempDisplay.displayNode();
                  tempDisplay = tempDisplay.next; 
           }
           System.out.println();
           
    }

  }
 
