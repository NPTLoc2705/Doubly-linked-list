/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stack;

/**
 *
 * @author GIGABYTE
 */
public class Node {

    public Object info;
    public Node next;

    public Node(Object info, Node next) {
        this.info = info;
        this.next = next;
    }

    public Node(Object x) {
        this(x, null);
    }
}
