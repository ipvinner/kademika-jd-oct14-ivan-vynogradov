package lesson7.video9;

import java.util.Iterator;

public class SimpleLinkedList implements Iterable<Object> {
	private Node root;
	private int size;
	
	
	public SimpleLinkedList(){
		this.size = 0;
		//Node n = new Node();
	}
	
	public void addFirst(Object o) {
		Node n = new Node();
		n.o = o;
		
		if (root != null){
			n.ref = root;
		}
		root = n;
		size++;

	}

	public void addLast(Object o) {
		Node n = new Node();	// Create new Object(Node)
		n.o = o; // set o var the argument refference
		if(root == null){
			root = n;
		}else{
			Node last = root;
			Node cp = root;
			while(cp.ref != null){
				last = cp;
				cp = cp.ref;
			}
			last.ref = n;
		}
		size++;
	}
	
	public void addAfter(Object o1, Object o2){
		Node prevPointer = null;
		Node cp = root;
		
		do{
			if (cp.o == o2){
				prevPointer = cp;
				break;
			}
			cp = cp.ref;
		} while (cp != null && cp.ref != null);
		
		if (prevPointer == null){
			throw new IllegalStateException("List does not contain prev object.");
		}
		
		Node n = new Node();
		n.o = o1;
		
		if (prevPointer.ref != null){
			n.ref = prevPointer.ref;
		}
		
		size++;
		
	}
	
	public int getSize(){
		return this.size;
	}
	
	public void printList(){
		if (size == 0){
			System.out.println("list is empty");
		}
		System.out.println("{ ");
		Node cp = root;
		while (cp.ref != null){
			System.out.println(cp.o + ", ");
			cp = cp.ref;
		}
		
		System.out.println(cp.o);
		System.out.println(" }");
	}
	
	private class Node {
		private Object o;
		private Node ref;
	}

	@Override
	public Iterator<Object> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	class SLLIterator implements Iterator<Object>{
		
		private Node cp;
		
		public SLLIterator(){
			
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return (cp == null && root != null) || (cp != null && cp.ref != null);
		}

		@Override
		public Object next() {
			
			if (cp == null && root != null){
				cp = root;
				return cp.o;
			}
			
			if (hasNext()){
				cp = cp.ref;
				return cp.o;
			}
			
			throw new IllegalStateException("List has no more element");
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			if (!hasNext() && root == null){
				cp = null;
				root = null;
			}else if (!hasNext() && root != null){
				root.ref = null;
				cp = null;
			} else if ( hasNext() && root == null){
				root = cp.ref;
				cp = cp.ref;
			}
			size--;
		}
	}
	
}
