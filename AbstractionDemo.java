/*INjava Abstaction can be done in two ways
1. Abstract class 
here we will define a clas s with abstract method and concrete methods 
Step 1: creatig a class using abstact keyword 
Step 2: Define abstact methods (method withou body) nd concrete methods (methods with a body) in the abstract class.
    Step 3: Create a subclass that extends the abstract class and provides implementations for the abstract methods.
    Step 4: Create an object of the subclass and call the methods to demonstrate abstraction.
    Step 5: Run the program to see how abstraction works in Java. */



 abstract class Animal{
    //abstract method (does not have body)
    public abstract void makeSound();
    
    //Regular method 
     public void sleep() {
        System.out.println("Zzz...");
    }
}
class Dog extends Animal{
    //Providing implementaion  for the abstract method
   public void makeSound() {
  
        System.out.println("Woof!");
    }
}
class Bird extends Animal{
     //Providing implementaion  for the abstract method
   public void makeSound() {
    System.out.println("Tweet!");

}
} 
   public class AbstractionDemo {
    public static void main(String[] args) { 
        Dog dog=new Dog();
        // statement before = is object of the class and 
        // after = is constructor of the class
        Bird bird = new Bird();

        dog.makeSound();  // Output: Woof! coming from child  class method

        dog.sleep(); // Output: Zzz... coming from parent clasds method
         
        bird.makeSound();
        bird.sleep();
    }
}
