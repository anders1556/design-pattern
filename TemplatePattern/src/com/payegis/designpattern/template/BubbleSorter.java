package com.payegis.designpattern.template;

/**
 * @author SongChao.
 * 冒泡排序模板类
 * 实现公用方法并确定抽象方法
 */
public abstract class BubbleSorter
{
   private int operations;
   protected int length = 0;
   // 调用抽象方法
   protected int doSort()
   {
      operations = 0;
      if(length <= 1)
      {
         return operations;
      }
      for(int nextToLast = length-2; nextToLast>=0; nextToLast--)
      {
         for(int index = 0; index <= nextToLast; index++)
         {
            if(outOfOrder(index))
            {
               swap(index);
               operations++;
            }
         }
      }
      return operations;
   }
   
   // 定义抽象方法
   protected abstract void swap(int index);
   protected abstract boolean outOfOrder(int index);

}
