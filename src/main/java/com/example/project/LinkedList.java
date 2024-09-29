package com.example.project;

public class LinkedList<T> implements List<T>{
	private Node<T> head;
	private Node<T> current;
	
    public LinkedList() {
		head = current = null;
	}
	public boolean empty() {
		return head == null;
	}
	public boolean last() {
		return current.next == null;
	}
    public boolean full() {
        return false;
    }
    public void findFirst() {
        current = head;
    }
    public void findNext() {
        current = current.next;
    }
    public T retrieve() {
        return current.data;
    }
    public void update(T e) {
        current.data = e;
    }
    public void insert(T e) {
        if (empty()) {
            current = head = new Node<T>(e);
        } else {
            Node<T> tmp = current.next;
            current.next = new Node<T>(e);
            current = current.next;
            current.next = tmp;
        }
    }
    public void remove() {
        if (current == head) {
            head = head.next;
        } else {
            Node<T> tmp = head;
            while (tmp.next != current) {
                tmp = tmp.next;
            }
            tmp.next = current.next;
        }
        if (current.next == null) {
            current = head;
        } else {
            current = current.next;
        }
    }
   public T mostFrequentElement() {
    	   Node<T> temp1 = head;
           
           Node<T> temp3 = head;
           int Mfreq=0;
          
          
           while(temp1 != null) {
           	 int Cfreq=0;
           	 Node<T> temp2 = head;
           while(temp2 !=null) {
           	if(temp1.data == temp2.data) {
           		Cfreq++;
           	}
           	temp2=temp2.next;
           }
           if(Cfreq > Mfreq) {
           	Mfreq = Cfreq;
           	temp3=temp1;
           }
           temp1=temp1.next;
           }
           
           
           return temp3.data;
           
           
    }
}
