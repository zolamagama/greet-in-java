package Greet;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Greet {
//    ArrayList<String> greetedNames = new ArrayList<>();
    Map<String, Integer> greetedNames = new HashMap<>();
//    int userCount = 0;
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
        }
        return greetMessage;

    }
    public int getUserThatIsInTheList
            (String userName){
      return greetedNames.get(userName);
    }

    public Map<String, Integer> getUsers
            () {
        return greetedNames;
    }

//    public int counterForIdenticalName(String userName) {
//
//        ArrayList<String> specificUserName = new ArrayList<>();
//
//        return 0;
//    }

    public int counter
            () {

    return greetedNames.size();

    }

    public static void main(String[] args) {
        Greet greet = new Greet();
        Scanner scanner = new Scanner(System.in);
        String userName2;
        String language2;

        userName2 = scanner.nextLine();
        language2 = scanner.nextLine();

        System.out.println(greet.greetName(userName2, language2));

    }
}
