import java.sql.Wrapper;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String name = "Zbdoul";

        System.out.println(name.charAt(0));
        // Ternary
        if(name.charAt(0) == 'A' ? true: false) {
            System.out.println("Name starts with A");
        }

        else {
            System.out.println("Name does not start with A");
            //System.out.println(isCapital("A"));
            //stringOne();
            //printStatements();
            //System.out.println(WhatDayQM("Monday"));
            loops(12);
        }
    }

    static void loops(int num){

//        for(int i = 0; i<num ; i++){
//            System.out.println("Number in the for loop: "+i);
//        }

//        while(num > 5){
//            System.out.println(" This is the Number : "+ num);
//            num--;
//
//        }
        do{

            System.out.println(" This is a do while loop !" + num);
            num--;
        }while(num > 5);

    }

    static int mathOne(){
        // **Wrapper Classes**: In Java, wrapper classes turn primitive data types (int, char, double, etc.) into objects.

       // **Autoboxing**: The automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes.

       // **Unboxing**: The reverse of autoboxing. It is the automatic conversion of wrapper classes back to their respective primitive types.

        // AutoBoxing
        Integer Myinteger = 25;

        int num = Myinteger;

        return num;
    }

    static void stringOne(){
        // Create and use Strings

        String Name = " Francisco ";

        String newStr = new String(" Put it in the Bag ! ");

        System.out.println(newStr.replace("t","").toUpperCase().replace(" ", ""));

    }

    static String escape(){
        return "\"Steven\" \nHulse";
    }
    static boolean isCapital(String c){
        if(c == c.toUpperCase() ){

            return true;
        }else{
            return false;
        }

    }

    static void printStatements(){

        System.out.println("Hello World !");
        System.out.print("Hello");
        System.out.printf(" AGE: %d, NAME: %s",30,"Steven");
    }

    static double mathClass(){

        // Math Class.

        return Math.sqrt(16);
    }

    static String WhatDayQM(String s) {


        switch(s){
            case "Monday":
                System.out.println("It is Monday");
                break;
            case "Tuesday":
                System.out.println("It is Tuesday");
                break;
            case "Wednesday":
                System.out.println("It is Wednesday");
                break;
            case "Thursday":
                System.out.println("It is Thursday");
                break;
            case "Friday":
                System.out.println("It is Friday");
                break;
            default:
                System.out.println("It is Sunday");
                break;
        }


        return s;
    }
}