public class Palindrome {
      public static void main(String[]public  args){
            String original  = "level";
            String reverse = "";
         
            for(int i=original.length()-1; i>=0; i--){
               reverse =reverse +original.charAt(i);
            }
             if(original.equals(reverse)){
                System.out.print("it is palindrome:");
             }
             else{
                System.out.print("it is not palindrome:");
             }
             }


    
}
