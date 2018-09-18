package com.Basic.ConvertHashSetToArray;

import java.util.ArrayList;
import java.util.List;

public class ConvertHashSetInToArray 
{
    public static void main( String[] args )
    {
    	
    /*Set<String>set=new HashSet<String>();
    	
    set.add("Santosh");
    set.add("Java Developer");
    */
    List<Integer>list=new ArrayList<Integer>();
    
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
   Integer []integers=new Integer[list.size()];
   
   
   list.toArray(integers);
   
   for(int i=0;i<integers.length;i++) {
	   System.out.print(integers[i]+" ");
	   
   
    //  System.out.println( "I am converted"+list );
    }
    }
}
