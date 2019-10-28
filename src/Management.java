
import java.awt.Choice;
import java.awt.Menu;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MyPC
 */
public class Management {
    
    
    
      public static int menu() {

        System.out.println("==========================================");
        System.out.println("=          REPLACE MANAGEMENT            =");
        System.out.println("==========================================");
        System.out.println("[1]. ADD A STRING AND CHECK NOT REPEAT");
        System.out.println("[2]. ADD A EMAIL");
        System.out.println("[3]. ADD A PHONE");
        System.out.println("[4]. ADD A DATE");
        System.out.println("[0]. EXIT ");
        System.out.println("==========================================");
        System.out.println("=          CHOOSE YOUR OPTION            =");
        System.out.println("==========================================");

        int choice = Validation.checkInputLimit(0, 16);
        return choice;
    }
    
    public String checkInputEmail(String str){
        
              System.out.println("Enter a email:");
        String st = Validation.checkInputEmail();
    return str;
      
    }
     
    public String checkInputPhone(String str){
        
              System.out.println("Enter a Phone:");
        String st = Validation.checkInputPhone();
    return str;
      
    }

    public String checkInputStringRepat(String str){
        
              System.out.println("Enter a email:");
        String st = Validation.checkInputEmail();;
    return str;
    }
     public String checkInputDate(String str){
        
              System.out.println("Enter a Date:");
        String st = Validation.checkInputDate();
    return str;
      
    }
    public static String repeatfunc() {
    
        
        System.out.println("Enter a String:");
        String str = Validation.checkInputString();
     
        String[] words = str.split("\\s");
        ArrayList<String> words2 = new ArrayList<>();
        String result = "";
        int k = 0;
        for (String w : words) {
            words2.add(w);
        }
        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 0; i < words2.size(); i++) {
            for (int j = i + 1; j < words2.size(); j++) {
                if (words2.get(i).equals(words2.get(j))) { 
                    index.add(j);
                    words2.set(i,"REPEAT");
                }   
                else{
                    break;
                }
            } 
        }
        for (Integer integer : index) {
            words2.set(integer, "");
        }
        for (String string : words2) {
            if(!string.equals("")){
                result += string+" ";
            }
        }
        result=result.replace("\\s+","");
        return result;
    }

    public static String showrepeatfunc(String str) {
    
        
        
     
        String[] words = str.split("\\s");
        ArrayList<String> words2 = new ArrayList<>();
        String result = "";
        int k = 0;
        for (String w : words) {
            words2.add(w);
        }
        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 0; i < words2.size(); i++) {
            for (int j = i + 1; j < words2.size(); j++) {
                if (words2.get(i).equals(words2.get(j))) { 
                    index.add(j);
                    words2.set(i,"REPEAT");
                }   
                else{
                    break;
                }
            } 
        }
        for (Integer integer : index) {
            words2.set(integer, "");
        }
        for (String string : words2) {
            if(!string.equals("")){
                result += string+" ";
            }
        }
        result=result.replace("\\s+","");
        return result;
    }

    public static void display() {
        while (true) {
            switch (menu()) {
                case 1:
                   repeatfunc();

                    break;
                case 2:
                    Validation.checkInputEmail();
//                    addIntData(ls);
                    break;
                     case 3:
                     Validation.checkInputPhone();
         
//                    addIntData(ls);
                    break;
                     case 4:
                    Validation.checkInputDate();
//                    addIntData(ls);
                    break;
                case 0:
                    return;

                default:
                    break;
            }
        }
    }
    
    
    public static void main(String[] args) {
        
         
        Management oj = new Management();
        oj.display();
       
    }
    
}
