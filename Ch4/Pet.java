
public class Pet
{
    // instance variables - replace the example below with your own
    private boolean alive;
    private String name;
    private static int numPets;
    
    /**
     * Constructor for objects of class Pet
     */
    public Pet(){
        
    }
        // initialise instance variables
        
    
    public Pet(String nm, boolean alv) {
        this.alive = alv;
        this.name = nm;
        numPets++;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return "The pet's name is: " + this.name;
    }
    
    public boolean equals(Pet other){        
        if(this.name.equals( other.name)) {
            return true;
        }
        else {
            return false;
            }
    }
    
    public static void example(){
        System.out.print("This is in a static method!");
    }
    
}
