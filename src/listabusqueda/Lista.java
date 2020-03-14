/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listabusqueda;

public class Lista{
static boolean encontrado = false;
public static String BuscarLista(Node frente, Node Final, int valor){
    String cadena = "True";
    int saltosFrente = 0;
    int saltosFinal = 0;
    for(Node i = frente; i != null; i = i.NextElement){
       if(valor == i.getValueNodo()){
           encontrado = true;
           break;
       }else if(encontrado == false){
           saltosFrente++;
       }
    }
    encontrado = false;
    for(Node i = Final; i != null; i = i.previousElement){
        if(valor == i.getValueNodo()){
           encontrado = true;
           break;
       }else if(encontrado == false){
           saltosFinal++;
       }
    }
    if(encontrado == true){
    if(saltosFrente < saltosFinal)
        cadena = "izquierda";
    else if(saltosFinal < saltosFrente)
        cadena = "derecha";
    else if(saltosFinal == saltosFrente)
        cadena = "iguales";
    }else{
        cadena = "no encontrado";
    }
    return cadena;
}

    public static void main(String[] args) {
        DoubleLinkedList ListaDoble = new DoubleLinkedList();
        ListaDoble.addFirst(3);
        ListaDoble.addLast(5);
        ListaDoble.addLast(7);
        ListaDoble.addLast(8);
        ListaDoble.addLast(9);


        ListaDoble.print();
        String res = BuscarLista(ListaDoble.getFirstElement(), ListaDoble.getLastElement(), 8);
        System.out.println(res);

    }
}