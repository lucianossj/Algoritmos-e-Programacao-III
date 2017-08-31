package br.com.senacrs.algiii.aula3.listadencadeada;

public class List<E> {

	private Node<E> first;
	private Node<E> last;
	
	public E getFirst() {
		
		return this.first.getObject();
		
	}
	
	public E getLast() {
		
		return this.last.getObject();
		
	}
	
	public void insertEnd(E object) {
		
		Node<E> newNode = new Node<E>(object);
		
		if(emptyList()) {
			
			this.first = this.last = newNode;
			
		} else {
			
			last.setNext(newNode);
			newNode.setPrevious(last);
			last = newNode;			
			
		}
		
	}
	
	public void insertBegin(E object) {
		
		Node <E> newNode = new Node<E>(object);
		
		if(emptyList()) {
			
			this.first = this.last = newNode; 
			
		} else {
			
			newNode.setNext(first);
			first.setPrevious(newNode);
			first = newNode;
			
		}
				
	}
	
	public E removeBegin() {
		
		if(emptyList()) {
			
			System.out.print("Lista vazia!!!");
			
		}
		
		E removedObject = first.getObject();
		
		if(first == last) {
			
			first = last = null;
			
		} else {
			
			first = first.getNext();
			
		}
		
		return removedObject;
		
	}
	
	public E removeEnd() {
		
		if(emptyList()) {
			
			System.out.print("Lista vazia!!!");
			
		}
		
		E removedObject = last.getObject();
		
		return removedObject;
		
	}
	
	public boolean emptyList() {
		
		return (this.first == null);
		
	}
	
}
