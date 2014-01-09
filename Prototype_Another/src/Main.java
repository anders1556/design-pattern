
/*浅拷贝*/

public class Main
{

   public static void main(String[] args)
   {
      // TODO Auto-generated method stub
      
     BrotherChao a = new BrotherChao();
     a.setListValue("BrotherChao");
     

     BrotherChao b = (BrotherChao) a.clone();
     b.setListValue("PC");
     
     System.out.println(a.getListValue());

   }

}
