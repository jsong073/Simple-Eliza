import java.util.Scanner;

public class ElizaChats {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String response = "";

        System.out.println("Good day. What's going on? ");
        System.out.print("Enter your response here or type \"q\" to quit: ");
        response = input.nextLine();
        while (!response.equalsIgnoreCase("q") &&
                !response.equalsIgnoreCase("I am feeling great")) {
            System.out.println("Why did you say \"" + response + "\"? ");
            System.out.print("Enter your response here or type \"q\" to quit: ");
            response = input.nextLine();
        }

        if (response.equalsIgnoreCase("I am feeling great")) {
            System.out.println("I am happy that you are feeling great.");
        }

        System.out.println("Have a nice day.");
    }
}
