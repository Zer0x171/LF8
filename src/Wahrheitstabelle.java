public class Wahrheitstabelle {
    public Wahrheitstabelle(){
        boolean a,b;

        //1 &&
        a = false;
        b = false;
        System.out.println("1. a AND b: " + (a && b));
        //1 ||
        System.out.println("1. a OR b: " + (a || b));
        //1 ^
        System.out.println("1. a XOR b: " + (a ^ b));        

        System.out.println("\n");

        //2 &&
        a = false;
        b = true;
        System.out.println("2. a AND b: " + (a && b));
        //2 ||
        System.out.println("2. a OR b: " + (a || b));
        //2 ^
        System.out.println("2. a XOR b: " + (a ^ b));  
        
        System.out.println("\n");

        //3 &&
        a = false;
        b = true;
        System.out.println("3. a AND b: " + (a && b));
        //3 ||
        System.out.println("3. a OR b: " + (a || b));
        //3 ^
        System.out.println("3. a XOR b: " + (a ^ b));  

        System.out.println("\n");

        //4 &&
        a = true;
        b = false;
        System.out.println("4. a AND b: " + (a && b));
        //4 ||
        System.out.println("4. a OR b: " + (a || b));
        //4 ^
        System.out.println("4. a XOR b: " + (a ^ b));  

        System.out.println("\n");

        //5 &&
        a = true;
        b = true;
        System.out.println("5. a AND b: " + (a && b));
        //5 ||
        System.out.println("5. a OR b: " + (a || b));
        //5 ^
        System.out.println("5. a XOR b: " + (a ^ b));  
    }
}