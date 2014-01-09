
public class CaesarServer implements CaesarElement
{
   private String name = "Caesar Server端";  
   
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
