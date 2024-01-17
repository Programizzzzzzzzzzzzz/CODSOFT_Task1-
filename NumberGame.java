import java.util.Random;
import java.util.Scanner;
public class NumberGame
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        Random rd= new Random();

        int sol=rd.nextInt(100);
        int rounds = 3;
        boolean correct = false;

        System.out.println("|| WELCOME TO NUMBER GUESSING GAME ||");
        System.out.println();
        while(rounds>0)
        {
            System.out.println("Enter your number from 0 to 100");
            int number=sc.nextInt();
            System.out.println();
            if(number==sol)
            {
                System.out.println("Congratulations you have guessed the number correctly!");
                break;
            }
            else if(number<sol)
            {
                System.out.println("Sorry, you guessed the number wrong!");
                System.out.println();
                System.out.println("You have "+ (rounds-1) +"tries left!");
                rounds--;
            }
            else if(number >sol)
            {
                System.out.println("Sorry, you guessed the number wrong!");
                System.out.println();
                System.out.println("You have "+ (rounds-1) +"tries left!");
                rounds--;
            }
        }
        System.out.println();
        if (correct==false)
        {
            System.out.println("Sorry, you ran out of trials! The correct number is :"+ sol);
        }
    }

}