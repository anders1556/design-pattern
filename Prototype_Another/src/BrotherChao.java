
import java.util.ArrayList;
import java.util.List;


/* ConcretePrototype A */

public class BrotherChao extends Programmer{
   
   private List<String> list = new ArrayList<String>();

   
   public BrotherChao(){
      // TODO Auto-generated constructor stub  
      System.out.println("<--我是BrotherChao的构造函数-->");
   }
   
   public void setListValue(String value){
      list.add(value);
  }
   public List<String> getListValue(){
      return this.list; 
  }

}
