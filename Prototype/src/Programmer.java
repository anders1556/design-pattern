
/* Prototype */

public abstract class Programmer implements Cloneable{
   
   public Programmer clone(){
      
      Programmer p = null;
      
      try
      {
         p = (Programmer) super.clone();
      }
      catch (CloneNotSupportedException e)
      {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      
      System.out.println("<--我来拷贝BrotherChao-->");

      return p;
   }

}
