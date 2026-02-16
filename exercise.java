import java.util.Scanner;

public class exercise
  {
    public static void main(String[] args)
    {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter either banana or apple please:   ");
      String fruit = keyboard.nextLine();
      if(fruit.equalsIgnoreCase("banana"))
      {
        System.out.println("Thank you! Just what I wanted");
        
        
      }
      else
      {
        if(fruit.equalsIgnoreCase("apple"))  //instead of having two if statements we can use the OR operator "||"
        {
            System.out.println("Thank you!! Just what I wanted");

        }
        else
        {
        System.out.println("error. I actually only want apples or bananas rn."); 
        }
      }
    }
  }
    
