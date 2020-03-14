/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listabusqueda;


public class Node {
    public int ValueNodo;
    public Node NextElement;
    public Node previousElement;

    // Constructor
    public Node(int value) {
        this.ValueNodo = value;
    }

    public int getValueNodo() {
        return ValueNodo;
    }

    public void setValueNodo(int value) {
        this.ValueNodo = value;
    }

    public Node getNextElement() {
        return NextElement;
    }

    public void setNextElement(Node nextElement) {
        this.NextElement = nextElement;
    }

    public Node getPreviousElement() {
        return previousElement;
    }

    public void setPreviousElement(Node previousElement) {
        this.previousElement = previousElement;
    }

    @Override
    public String toString() {
        return "Node [ "+ ValueNodo +"]";
    }
}