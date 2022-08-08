	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}
  
  ------------------------------------------------------
  
  public class Solution {
	public static int findNode(LinkedListNode<Integer> head, int n) {
        LinkedListNode<Integer> temp = head;
		// Write your code here.
    	if(temp==null){
            return -1;
        }
        

        int c=-1;
        while(temp.next!=null && temp!=null){
            c++;
            if(temp.data==n){
                temp = temp.next;
                return c;  
            }
            else{
                temp = temp.next;
            }
            
        }
        return -1;

	}
}

---------------------------------------------------------------------------------
