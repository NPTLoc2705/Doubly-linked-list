/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stack;

import java.util.Scanner;

/**
 *
 * @author GIGABYTE
 */
public class main {

    public static void decToBin(int k) {
        LinkedStack s = new LinkedStack();
        System.out.print(k + " in binary system is: ");
        while (k > 0) {
            s.push(new Integer(k % 2));
            k = k / 2;
        }
        while (!s.isEmpty()) {
            System.out.print(s.pop());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        decToBin(11);
        System.out.println();

    }
}
