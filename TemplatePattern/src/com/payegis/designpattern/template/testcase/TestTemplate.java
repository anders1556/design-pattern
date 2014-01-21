package com.payegis.designpattern.template.testcase;

import com.payegis.designpattern.template.DoubleBubbleSorter;
import com.payegis.designpattern.template.IntBubbleSorter;

public class TestTemplate
{
   public static void main(String[] args)
   {
      int[] intArray = {20,14,16,9,10,13,18};
      double[] doubleArray = {20.50,20.43,20.88,20.45,20.72};
      
      //int ≈≈–Ú
      IntBubbleSorter ibs = new IntBubbleSorter();
      ibs.sort(intArray);
      System.out.println("----------int sorter----------");
      for(int i=0;i<intArray.length;i++)
      {
         System.out.print(intArray[i]+",");
      }
      System.out.println();
      
      //double ≈≈–Ú
      DoubleBubbleSorter dbs = new DoubleBubbleSorter();
      dbs.sort(doubleArray);
      System.out.println("----------double sorter----------");
      for(int i=0;i<doubleArray.length;i++)
      {
         System.out.print(doubleArray[i]+",");
      }  
   }
}
