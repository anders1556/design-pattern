package com.payegis.designpattern.template;

/**
 * @author SongChao.
 * �������ࣺInt ����
 */
public class IntBubbleSorter extends BubbleSorter
{
   private int[] array;

   public int sort(int[] array)
   {
      this.array = array;
      length = array.length;
      return doSort();
   }

   @Override
   protected void swap(int index)
   {
      int temp = array[index];
      array[index] = array[index + 1];
      array[index + 1] = temp;
   }

   @Override
   protected boolean outOfOrder(int index)
   {
      return array[index] > array[index + 1];
   }

}
