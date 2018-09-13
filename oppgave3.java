import java.util.Scanner;

public class oppgave3 {


public static void main(String[] args) {
   Scanner reader = new Scanner(System.in);
   System.out.println("Hva skal n være:");
   int userIn = Integer.parseInt(reader.nextLine());
   int factorial = 1;
   int i= userIn;
   while (userIn >= 1) {
    factorial *= userIn;
    userIn--;
   }
  System.out.println("Det blir:"+factorial);
 }
}

