
public class Hat
{
    // instance variables - replace the example below with your own
    private String style;
    private int price;

   public Hat()
    {
        // initialise instance variables
        
    }

   public Hat(String sty, int prc) {
        this.price = prc;
        this.style = sty;
    }
   
   public String getStyle() {
       return this.style;
    }
    
   public String toString() {
        return "The type of hat is: " + this.style;
    }
}
