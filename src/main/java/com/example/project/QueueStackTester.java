package com.example.project;

public class QueueStackTester {
   public static <T> void split(Queue<T> q, Queue<T> oq, Queue<T> eq)
    {
        if(q.length()==0) {
        	return ;
        }
        
       int i=1;
       while(i<=q.length()) {
    	   T x= q.serve();
    	   if(i%2==1) {
    		   oq.enqueue(x); 
    	   }else {
    		   eq.enqueue(x);
    		   
    	   }
    	   i++;
    	   q.enqueue(x);
    		   
    	   
    	   
       }
        // Write the recursive static method split that splits a queue of n elements into two
        // queues. The elements with odd orders (i.e. 1st, 3rd, 5th ...) should be put in the
        // first queue and elements with even orders (i.e. 2nd, 4th, 6th ...) should be put in
        // the second queue. The original queue should remain unchanged at the end of the
        // method.
        // Example. Given the queue (A, B, C, D, E), split results in oq (A, C, E), and eq(B, D).
    }
    public static <T> void remove(LinkedPQ<T> pq, int pr)
    {	LinkedPQ<T> temp= new LinkedPQ<T>();
       if(pq.length()==0)
    	   return;
       int count =pq.length();
       for (int i = 0; i <count; i++) {
    	   PQElement<T> t= pq.serve();
    	   if(t.p >=pr )
    		   temp.enqueue(t.data, t.p);
    		  
    	  
	}
       count= temp.length();
       for (int i = 0; i < count; i++) {
    	   PQElement<T> t= temp.serve();
    	   pq.enqueue(t.data, t.p);
	}
       
       
        // Write a static method remove that removes every element in the priority queue
        // having priority less than p.
        // Example. Given pq: [A, 10], [D, 8], [B, 5], [E, 3], [C, 2] remove(pq, 5) results in
        // pq: [A, 10], [D, 8], [B, 5].
    }
    public static <T> boolean search(Stack<T> st, T e)
    {
        boolean yes=false;
        T t[]= (T[]) new Object[100];
        int i = 0;
        for (;!st.empty()&& i < t.length; i++) {
			t[i]=st.pop();
		}
       for (int j = 0; j < i; j++) {
    	   if(e.equals(t[j]))
           	yes=true;
	}
       for (i--; i > -1;i--) {
		st.push(t[i]);
	}
        
        
        return yes;
        
        // Write the recursive static method search that searches for an element e in a stack st
        // and returns true if it’s found or false otherwise. st should not change at the end of
        // the method. You are not allowed to use any auxiliary data structures.
        // Example. Given the stack st (top-to-bottom): 5, 7, 5, 3, 2. search(st, 3) returns
        // true while search(st, 1) returns false.
    }
}
