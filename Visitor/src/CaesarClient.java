
public class CaesarClient implements CaesarElement
{
   private String name = "Caesar Client端";  
   
   public String getName() {  
       return name;  
   }  
 
   @Override
   public void accept(Visitor visitor)
   {
      // TODO Auto-generated method stub
      visitor.visit(this);
      
   }

}
