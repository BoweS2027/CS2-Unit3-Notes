public class Main {

   public static void main(String []args) {
      //create a new string shortcut
      String st = "Hello World";
      //original string
      String str = new String("goat");
      //all cojects can be created using className objectName = new className
      BuildABear kitty = new BuildABear();
      System.out.println(kitty);

      // create a new object with our own values
      // called the Constructor: ClassName(string, string, int)
      BuildABear doggy = new BuildABear("cat", "Catterackanitic", 90);
      //printing an object calls the classes toString() method
      System.out.println(doggy);
      // getters are non-void
      System.out.println(kitty.getType());
      double price = kitty.getPrice();
      //setters are void
      //calling void methods: objectName.methodName();
      kitty.setName("doggully");
      // setters (mutators) changed values. let'see the effects:
      // STATIC variables & methods belong to a class
      // get called using the Class name, Not an object
      BuildABear.showStore();
      double randNum = Math.random();
      //the main method is static bc there is. only one coppy of it per program

   } //end main
} // emd main class
