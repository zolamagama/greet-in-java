package Greet;


import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Greet {
    Map<String, Integer> greetedNames = new HashMap<>();
    public void addUser(String name) {
        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();

        if (!greetedNames.containsKey(name)) {
            greetedNames.put(name, 1);
        } else if (greetedNames.containsKey(name)) {
            greetedNames.put(name, greetedNames.get(name) + 1);
        }
    }

    public String greetName(String userName, String language) {
        String greetMessage = "";
        addUser(userName);
        userName = userName.substring(0, 1).toUpperCase() + userName.substring(1).toLowerCase();
        language = language.substring(0, 1).toUpperCase() + language.substring(1).toLowerCase();
        switch (language) {
            case "Chinese":
                greetMessage = "你好, " + userName;
                System.out.println(greetMessage);
                break;
            case "English":
                greetMessage = "Hello, " + userName;
                System.out.println(greetMessage);
                break;
            case "Italian":
                greetMessage = "Ciao, " + userName;
                System.out.println(greetMessage);
                break;
            default:
                greetMessage = "Hi, " + userName ;
                System.out.println(greetMessage);

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

        userName = userName.substring(0, 1).toUpperCase() + userName.substring(1).toLowerCase();
        if(greetedNames.containsKey(userName)) {
            greetedNames.put(userName, greetedNames.get(userName) - 1);
        }
        if (greetedNames.get(userName) < 1) {
            greetedNames.remove(userName);
        }
        System.out.println("User " + userName + " has been successfully cleared");
    }

    public void clear() {
        greetedNames.clear();
        System.out.println("The user names have been successfully cleared");
    }

    public void help() {

        System.out.println("Type 'english' to be greeted in English");
        System.out.println("Type 'italian' to be greeted in Italian");
        System.out.println("Type 'chinese' to be greeted in Chinese");
        System.out.println("Type 'greeted' to show how many times a specific user was greeted");
        System.out.println("Type 'greeted' + 'userName' to show how many times the user selected was greeted");
        System.out.println("Type 'counter' to show how many times each user was greeted");
        System.out.println("Type 'help' to show greetings application guideline");
        System.out.println("Type 'exit' to leave the application");


    }

}
