package com.company.controllers;

import java.util.Scanner;

public class UserPrompt
{
    public static void promptWord()
    {
        boolean userChoseQuit = false;

        while (!userChoseQuit)
        {
            System.out.println("\nPlease Input a Word\n");
            System.out.println("\nEnter Q/q to Quit\n");

            Scanner selection = new Scanner(System.in);
            String word = selection.next().toLowerCase();

            System.out.print("\n You entered: " + word);

            if (!word.equals("q"))
            {
                //The rest of the program will go from here
            }
            else
            {
                System.out.print("\nThe program will now close....");
                System.exit(0);
                break; //This line won't be reached right?
            }
        }
    }
}
