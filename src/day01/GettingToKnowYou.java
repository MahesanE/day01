package day01;

import java.io.Console;

public class GettingToKnowYou {
    public static void main(String[] args) {
        
        //Read from the input
        //so we need to get a console like below

        Console cons = System.console();
        //Prompt the user and read the line when hitting enter
        String name = cons.readLine("What is your name? ");
        if(name.equalsIgnoreCase("Fred")){
            System.out.printf("Yabadabadoo\n ");
        }
        else{

        System.out.printf("Hello %s\n",name);
        }

        //%s represents the string that you want to format.

        String email = cons.readLine("What is your email? ");
        if(email.length() > 0){
            System.out.printf("Hello %s. Your email is %s\n",name,email);

        }
        else{
        System.out.printf("Hello %s\n.",name);

    }
}
}