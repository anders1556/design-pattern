
public class VisitorTing implements Visitor
{

   @Override
   public void visit(CaesarClient code)
   {
      // TODO Auto-generated method stub
      
   }

   @Override
   public void visit(CaesarServer code)
   {
      // TODO Auto-generated method stub
      System.out.println("Ting 负责 " + code.getName() + "的代码");
      
   }

   @Override
   public void visit(Caesar code)
   {
      // TODO Auto-generated method stub
      
   }

}
