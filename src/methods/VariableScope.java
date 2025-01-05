package methods;

public class VariableScope {
    static String myVariable = "abc"; // Global variable

    public static void main(String[] args){
        method1();
        method2();
    }

    public static void method1(){
        System.out.println("Global myVariable is " + myVariable); // Prints the global myVariable
        String myVariable = "def"; //Local variable
        System.out.println("Local myVariable is " + myVariable); // Prints the local myVariable
    }

    public static void method2(){
        myVariable = "ghi"; // Update the global variable
        System.out.println("Updated global myVariable is " + myVariable); // Prints the updated global variable
    }
}
