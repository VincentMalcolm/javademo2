import java.util.Scanner;

public class Demo
  {
    public static void main(String[] args)
    {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter secret code:   ");
      String code = keyboard.nextLine();
      if(code.equals("tacoman")) // this is the .equals method. used when dealing with strings instead of using ==
      {
        System.out.println("Access Granted");
      }
      else
      {
        System.out.println("Access Denied");
      }
    }
  }
    
