
public class Main
{

   public static void main(String[] args)
   {
      // TODO Auto-generated method stub
      
     BrotherChao a = new BrotherChao();
     
     System.out.println(a.name);
     System.out.println(a.computer);
    

     BrotherChao b = (BrotherChao) a.clone();
     
     System.out.println(b.name);
     System.out.println(b.computer);
     
     b.name = "XiaoYu";
     
     System.out.println(a.name);
     System.out.println(b.name);


     

   }

}
