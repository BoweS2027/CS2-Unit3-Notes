//BuildABear.java defines the BuildABear class which is a template for BuildABear objects
public class BuildABear {
    //section in an object-class: instance variables (data,attributes/fields), constructors (initialize values), methods (behaviors/actions)
    private  String type;
    private String name;
    private int fillLevel;
    private double price;
    private boolean hasSound;
    //encapculation: keeping variables private (they can't be directly accessed outside of this class)
    // static variables belong to a general class
    private static String store location = "landyland";
    private static int inventoryCount location = 50;

    public BuildABear() {
        this.type = "dog"; // WE PICK the initial values!
        this.name = "Dogananticavious";
        this.fillLevel = 75;
        this.price = 150.00;
        this.hasSound = false; 
    }

    public BuildABear(String t, String n, int fl) {
     this.type = t; // USER, picked the value for type!
     this.name = n;
     this.fillLevel = fl;
     this.price = 150.00;  
     this.hasSound = false;
     
    }
    

public String getType() {
    return type;
}
public String getName(){
    return name;
}
public int getfillLevel(){
    return fillLevel;
}
public double getprice(){
    return price;
}
//write a toString() method so that we can print an object's state
//including this method changes what happens when you print an object
// otherwise, doing Sistem.out.println(object just shows a memory location)
public String toString(){
    String state = "BuildABear[" + type + ", " + name + ", " + fillLevel + ", " + price + "]";
    return state;
}
public static void showStore() {
    System.out.println("welcome to " + storeLocation + " Build a Bear Workshop!");
    
}
} //end class