public class SimpleCalculator {
    
    //Method ->1 a+b
    //Method  ->2 a-b
    //Method ->3 a*b   
    //Method  ->4 a/b

    //Step 1: Addition method 
    public static int add(int a, int b){
        return a+b;
    }

    //Step 2: Substration
    public static int subtract(int a, int b){
        return a-b;
    }

    //Step 3: Multiply
    public static int multiply(int a, int b){
        return a*b;
    }

    //Step 4: Division
    public static int divide(int a, int b){
        if(b==0){
          System.out.println("Not Defined");
        return 0;   // or any default value
    }
    else
        return a / b;
}

    public static void main(String[] args) {
        //step 5: declare the value 
        int num1= 5;
        int num2= 0;
        System.out.println("sum =" + add(num1,num2));
        System.out.println("subtract =" +  subtract(num1,num2));
         System.out.println("multiply =" + multiply(num1,num2));
          System.out.println("divide =" + divide(num1,num2));
    }
        







    
}
