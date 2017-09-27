/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TowersofHanoi;

import java.util.Scanner;

/**
 *
 * @author kavunnuggihalli
 */
public class TowersofHanoi{

   public static void main(String[] args) {
       System.out.print("Enter number of rings: ");
       Scanner keys = new Scanner(System.in);
       int rings = keys.nextInt();
       solve(rings, "A", "B", "C");
   }
   
   private static void solve(int n, String start, String middle, String end) {
       if (n == 1) {
           System.out.println("Take a disc from: "+start + " Move to -> " + end);
       } else {
           solve(n - 1, start, end, middle);
           System.out.println("Take a disc from: "+start + " Move  to -> " + end);
           solve(n - 1, middle, start, end);
       }
   }
}