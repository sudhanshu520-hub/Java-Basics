public class Fibonacci {
   public static void main(String[]  args){
    int count = 10, num1 = 0, num2 = 1;
    System.out.println("Fibonacci series of" + count + "numbers:");
    int i=1;
    while(i<=count){
       System.out.println(num1 + ""); 
       
   
   int sumofPrevTwo = num1 +num2;
   num1 = num2; 
   num2 = sumofPrevTwo;
   i++;
}
}
   
   
    
}
