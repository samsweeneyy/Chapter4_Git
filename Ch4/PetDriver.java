
public class PetDriver
{
   public static void main() {
       Pet mango = new Pet( "Mango", true );
       System.out.println(mango.getName());
       Pet spider = new Pet ("Mango", true);
       System.out.println(spider.equals(mango));
       Pet.example();
    }
}
