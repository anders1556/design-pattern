
public class Main
{

   public static void main(String[] args)
   {
      // TODO Auto-generated method stub
      
      Caesar caesar = new Caesar();
      
      VisitorChao chao = new VisitorChao();
      
      caesar.accept(chao);
      
      VisitorTing ting = new VisitorTing();
      
      caesar.accept(ting);

   }

}
