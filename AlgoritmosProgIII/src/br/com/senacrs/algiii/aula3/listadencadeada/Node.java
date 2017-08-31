package br.com.senacrs.algiii.aula3.listadencadeada;

public class Node<E> {

	private E object;
	private Node<E> next;
	private Node<E> previous;
	
	public Node(E object){
		
		this.object = object;
		
	}
	
	public E getObject() {
		
		return this.object;
		
	}
	
	public Node<E> getPrevious(){
		
		return this.previous;
		
	}
	
	public Node<E> getNext(){
		
		return this.next;
		
	}
	
	public void setPrevious(Node<E> previous){
		
		this.previous = previous;
		
	}
	
	public void setNext(Node<E> next){
		
		this.next = next;
		
	}
	
}
