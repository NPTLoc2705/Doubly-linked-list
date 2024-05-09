/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mystack;

import static java.lang.Byte.SIZE;
import java.util.EmptyStackException;

/**
 *
 * @author GIGABYTE
 */
class Stack {

    protected Node head;

    public Stack() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean isFull() {
        return top() == SIZE;
    }

    public Node push(int x) {
        Node p = new Node(x, head);
        if (p == null) {
            System.out.print("\nHeap OverFlow");
        }
        p.data = x;
        p.next = head;
        head = p;
        return head;
    }

    public Node pop() throws EmptyStackException {
        if (isEmpty()) {
            head = null;
        }
        head = head.next;
        return head;
    }

    public int top() {
        if (isEmpty()) {
            head = null;
        }
        return head.data;
    }

    public void traverse() {
        if (isEmpty()) {
            head = null;
        } else {
            Node p = head;
            while (p != null) {
                System.out.println(p.data);
                p = p.next;
            }
        }

    }

    public void delete(int x) {
        if (isEmpty()) {
            head = null;
        } else {
            Node p = head;
            Node r = null;
            while(p!= null)
            {
                if(p.data != x)
                {
                    r = p;
                    p = p.next;                            
                }
                else
                {
                    if(r == null)
                    {
                        head = p.next;
                    }
                    else
                    {
                        r.next = p.next;
                    }
                    break;
                }
            }
            
    }
    }


    public void selectionSort() {
        if (head == null || head.next == null) {
            return; // Ngăn xếp quá ngắn
        }

        Node p = head;
        while (p != null) {
            Node minNode = p;
            Node r = p.next;

            while (r != null) {
                if (r.data < minNode.data) {
                    minNode = r;
                }
                r = r.next;
            }

            // Đổi tên của current và node có tên nhỏ nhất (nếu khác nhau)
            if (minNode != p) {
                int temp = p.data;
                p.data = minNode.data;
                minNode.data = temp;
            }
            p = p.next;
        }
    }
    public void search(int x)
    {
        Node p = head;
        if(isEmpty())
        {
            head = null;
        }
        else
        {
            int i = 1;
            while(p.next != null)
            {
                if(p.data == x)
                {
                    p = p.next;
                    break;
                }
                i++;
                p = p.next;
                
            }
            System.out.println("\nThe "+ x +" is at the location "+ i);
        }       
        }
    }

