import java.util.*;
class LinkedList<T> implements Iterable<T>
{
    private Node first; 
    private Node current;
    private int n;


 private class Node  
 {
     T data; 
     Node next; 
 }
 
    public LinkedList()
    {
      first=null;
      current=null;
      n=0;
    }
 
    public void insert(T data)
     {
      Node newNode = new Node();  
      newNode.data=data;
      newNode.next=null;
      if(first==null)
      {   
           first = newNode;  
           current = newNode;
      }
      else
      {
        current.next = newNode;
        current = newNode;
      }
      n++;
    }
 
    public int size()
    {
      return n;
    }

    public void deleteFirst()
    {
           if(first==null){                
                  System.out.println("LinkedList doesn't contain any Nodes.");
           }
           Node tempNode = first; 
           first = first.next; 
           n--;

    }
    

    public void deleteLast()
    {
           if(first==null){                
                  System.out.println("LinkedList doesn't contain any Nodes.");
           }
           Node tempNode = first;  
           while ((tempNode.next).next != null)
           {
                  tempNode = tempNode.next; 
           }    
           tempNode.next=null;
           n--;

    }

    public Iterator<T> iterator() 
    {
        return new CustomIterator();
    }

    private class CustomIterator implements Iterator<T>
    {
        private Node current = first;
        public boolean hasNext()  { return current != null;  
                           }
        public void remove()      { throw new UnsupportedOperationException();  }

        public T next() {
            if (!hasNext()) throw new NoSuchElementException();
            T data = current.data;
            current = current.next; 
            return data;
        }
    }

  }
 
