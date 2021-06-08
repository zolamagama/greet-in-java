package Greet;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Greet {
    Map<String, Integer> greetedNames = new HashMap<>();
    public void addUser(String name) {

        if (!greetedNames.containsKey(name)) {
            greetedNames.put(name, 1);
        } else if (greetedNames.containsKey(name)) {
            greetedNames.put(name, greetedNames.get(name) + 1);
        }
    }

    public String greetName(String userName, String language) {
        String greetMessage = "";
        addUser(userName);
        switch (language) {
            case "Chinese":
                greetMessage = "你好, " + userName;
                break;
            case "English":
                greetMessage = "Hello, " + userName;
                break;
            case "Italian":
                greetMessage = "Ciao, " + userName;
                break;
            case "greeted":
                getUsers();
                break;
            case "counter":
                System.out.println("Amount of users greeted: " + counter());
                break;
            case "clear":
                clear();
                System.out.println("Successfully cleared all the names");
                break;
            case "exit":
                greetMessage = "Successfully exited the application";
                break;

        }
        return greetMessage;

    }

    public Map<String, Integer> getUsers () {
        return greetedNames;
    }

    public int counter () {

    return greetedNames.size();
    }

    public void clearForOneUser(String userName) {

        if(greetedNames.containsKey(userName)) {
            greetedNames.put(userName, greetedNames.get(userName) - 1);
        }

    }

    public void clear() {
        greetedNames.clear();
        System.out.println("The user names have been successfully cleared");
    }

    public void exit() {

    }

    public void help() {

        System.out.println("Please enter your name and select the available options below: ");
        System.out.println("Type 'English' to be greeted in English");
        System.out.println("Type 'Italian' to be greeted in Italian");
        System.out.println("Type 'Chinese' to be greeted in Chinese");
        System.out.println("Type 'greeted' to show how many times a specific user was greeted");
        System.out.println("Type 'counter' to show how many times each user was greeted");
        System.out.println("Type 'exit' to leave the application");


    }

    public static void main(String[] args) {
        Greet greet = new Greet();
        greet.help();

        while(true) {
            Scanner scanner = new Scanner(System.in);
//            String userName2;
//            String language2;
//
//            userName2 = scanner.nextLine();
//            language2 = scanner.nextLine();

            String userInput = scanner.nextLine();
            String[] userNameAndCommand = userInput.split(" ", 2);
            String userName2 = userNameAndCommand[0];
            String language2 = (userNameAndCommand[1]);

            System.out.println(greet.greetName(userName2, language2));
        }
    }
}
