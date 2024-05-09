/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mystack;

/**
 *
 * @author GIGABYTE
 */
public class MyStack {

   
    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.push(7);
        myStack.push(3);
        myStack.push(8);
        myStack.push(5);
        myStack.push(1);
        myStack.push(9);
        
        //myStack.pop();
       // myStack.selectionSort();;
        myStack.search(5);
        //myStack.delete(7);
        myStack.traverse();
            
        }
    }
    
