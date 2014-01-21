package com.payegis.designpattern.template;

/**
 * @author SongChao.
 * 具体子类：Double 排序
 */
public class DoubleBubbleSorter extends BubbleSorter
{
   private double[] array;

   public int sort(double[] array)
   {
      this.array = array;
      length = array.length;
      return doSort();
   }

   @Override
   protected void swap(int index)
   {
      double temp = array[index];
      array[index] = array[index + 1];
      array[index + 1] = temp;
   }

   @Override
   protected boolean outOfOrder(int index)
   {
      return array[index] > array[index + 1];
   }
}
