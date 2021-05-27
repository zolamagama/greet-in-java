import java.util.ArrayList;
import java.util.Scanner;

public class Greet {
    ArrayList<String> greetedNames = new ArrayList<>();

    public String greetName(String name, int insert) {
        String greetMessage = "";

        if(!greetedNames.contains(name)) {
            switch (insert) {
                case 1:
                    greetMessage = " ,مرحبا" + name;
                    greetedNames.add(name);

                    break;
                case 2:
                    greetMessage = "Hello, " + name;
                    greetedNames.add(name);

                    break;
                case 3:
                    greetMessage = "Olá, " + name;
                    greetedNames.add(name);
                    break;
            }
        }
        return greetMessage;
    }

    public int counterForIdenticalName(String userName) {
        
        ArrayList<String> specificUserName = new ArrayList<>();

        for (String name: greetedNames) {
            if(name.equals(userName)) {
                specificUserName.add(userName);
            }
        }
    return specificUserName.size();
    }

    public int counter() {

    return greetedNames.size();

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName;
        Integer language;

        userName = scanner.nextLine();
        language = scanner.nextInt();

        Greet greet = new Greet();

        System.out.println(greet.greetName(userName, language));

    }
}
