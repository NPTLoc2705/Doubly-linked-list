/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mystack;

/**
 *
 * @author GIGABYTE
 */
public class Node {
    public int data;
    public Node next;

    public Node(int data,Node p) {
        this.data = data;
        this.next = p;
    }
}
