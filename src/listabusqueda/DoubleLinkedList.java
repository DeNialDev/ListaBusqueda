/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listabusqueda;

/**
 *
 * @author danie
 */
public class DoubleLinkedList {
    private Node tail;
    private Node head;
    public Node getFirstElement(){
        return head;
    }

    public Node getLastElement(){
        return tail;
    }
    public void addLast(Integer value) {
        Node Nodo = new Node(value);
        if (tail == null && head == null) {
            tail = Nodo;
            head = Nodo;
        } else {
            tail.setNextElement(Nodo);
            Nodo.setPreviousElement(tail);
            tail = Nodo;
        }
    }
 
    public void addFirst(Integer value) {
        Node Nodo = new Node(value);
        if (tail == null && head == null) {
            tail = Nodo;
            head = Nodo;
        } else {
            Nodo.setNextElement(head);
            head.setPreviousElement(Nodo);
            head = Nodo;
        }
    }
    
    public void print() {
        for (Node i = head; i != null; i = i.getNextElement()) {
            System.out.printf("\t %s ", i.toString());
        }
        System.out.println();
    }
}