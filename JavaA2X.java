/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaa2x;

import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;

/**
 *
 * @author Ibrahim
 */
public class JavaA2X {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
            //create a Vector object
    Vector v = new Vector();
   
    /*
       Add elements to Vector using
       boolean add(Object o) method. It returns true as a general behavior
       of Collection.add method. The specified object is appended at the end
       of the Vector.
    */
    v.add("Ibrhim");
    v.add("Ali");
    v.add("Ahamad");
   
    /*
      Use get method of Java Vector class to display elements of Vector.
      Object get(int index) returns an element at the specified index in
      the Vector    
    */
    System.out.println("Vector Examples");
    System.out.println(v.get(0));
    System.out.println(v.get(1));
    System.out.println(v.get(2));
    
    System.out.println("========================================");
    System.out.println("Array List Example");
    ArrayList <String> list=new ArrayList<String>();//Creating arraylist    
      list.add("Ibrahim");//Adding object in arraylist    
      list.add("Ali");    
      list.add("Ahmad");      
      //Invoking arraylist object   
      System.out.println(list);  
    System.out.println("========================================");
    System.out.println("Sorted Set");
    
    SortedSet<String> st = new TreeSet<>(); 
         
        st.add("Ibrahim"); 
        st.add("Ali"); 
        st.add("Ahmad"); 
  
        System.out.println("Sorted Set: " + st);
  }
    

    }
    
