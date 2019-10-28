/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Long
 */
public class B1 {

 public static String repeatfunc(String str) {
        String t[] = str.split("\\s+");
        String res = "";
        for(int i=0;i<t.length-1;i++){
            if(t[i] != "" && t[i].equals(t[i+1])){
                for(int j=i+1;j<t.length-1;j++)
                    if(t[j].equals(t[i])) t[j] = "";
                    else break;
                t[i] = "Repeat";
            }
            res = res + t[i] + " ";
        }
        return res.trim();
    }
 

    public static void main(String[] args) {
        String input = "I want to go go to go go";
        System.out.println("input = " + input);
        System.out.println(repeatfunc(input));
    }

    
}
