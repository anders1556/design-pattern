
public class Caesar implements CaesarElement
{

   private String name = "Caesar";  
   private CaesarClient client;  
   private CaesarServer server;  
     
   public Caesar() {  
       this.client = new CaesarClient();  
       this.server = new CaesarServer();  
   }  
 
   public void accept(Visitor visitor) {  
       visitor.visit(this);  
       client.accept(visitor);  
       server.accept(visitor);  
         
   }  
 
   public String getName() {  
       return name;  
   }  
}
