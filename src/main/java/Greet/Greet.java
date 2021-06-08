package Greet;


import java.util.HashMap;
import java.util.Map;

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

        System.out.println("Type 'English' to be greeted in English");
        System.out.println("Type 'Italian' to be greeted in Italian");
        System.out.println("Type 'Chinese' to be greeted in Chinese");
        System.out.println("Type 'greeted' to show how many times a specific user was greeted");
        System.out.println("Type 'counter' to show how many times each user was greeted");
        System.out.println("Type 'exit' to leave the application");


    }

}
