package Greet;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Greet greet = new Greet();
        System.out.println("Hi, enter a command to use application: ");

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();
            String[] parameter = userInput.split(" ");
            String command = parameter[0];
            if(command.equals("exit")) {
            break;
            }
            switch (command) {
                case "greet":
                    String name = parameter[1];
                    String lang = parameter[2];
                    greet.greetName(name, lang);
                    break;

                case "greeted":
                    String name1 = parameter[1];
                    System.out.println(greet.getUsers().get(name1));
                    break;

                case "clear":
                    greet.clear();
                    break;

                case "clearUser":
                    String name2 = parameter[1];
                    greet.clearForOneUser(name2);
                    break;

                case "help":
                    greet.help();
                    break;

                case "counter":
                    System.out.println(greet.counter());
                case "exit":
                    break;
            }
        }
    }
}
