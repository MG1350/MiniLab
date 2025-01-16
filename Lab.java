import java.util.*;
public class Lab{
    public static void main(String[] args)
    {
        ArrayList<String> favorites = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 6; i++)
        {
            System.out.println("What is your favorite color? ");
            String userInput = input.nextLine();
            favorites.add(userInput);
        }
        for (int i = 0; i < 6; i++)
        {
            System.out.println(i + " " + favorites.get(i));
        }
    }
}