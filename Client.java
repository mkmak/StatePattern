
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter words with alphabet {a,b,c} or 'quit' to exit:");
        String input = scanner.nextLine();
        while(!input.equals("quit")) {
            if(context.acceptedWord(input))
                System.out.println("Accepted!\n");
            else
                System.out.println("Rejected!\n");
            input = scanner.nextLine();
        }
    }
    
}
