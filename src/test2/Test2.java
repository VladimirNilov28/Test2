/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Test2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        System.out.printf("¬ведите 3х значное число: ");
        int userNum = scanner.nextInt();
        System.out.println("");
        int a = ((int)userNum/100);
        int b = ((int)userNum/10%10);
        int c = (int)userNum-((int)userNum/10)*10;
        System.out.printf(String.join("%n",
                "сотни - %1$-5d\n",
                "дес€тки - %2$-5d\n",
                "еденицы - %3$-5d\n"),a,b,c);
        System.out.println("");
    }
    
}
