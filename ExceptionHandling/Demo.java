package ExceptionHandling;


// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class Demo {
    public String name;
    public void runAway() {
        System.out.print("1");
        try {
            System.out.print("2");
            int x = Integer.parseInt(name);
            System.out.print("3");
        } catch(NumberFormatException e) {
            System.out.print("4");
            
        }
    }


public static void main(String[] args) {
    Demo webby = new Demo();
    webby.name = "Webby";
    webby.runAway();
    System.out.print("5");
}
}//1245
