package GreetTest;

import Greet.Greet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class greetTest {
    @Test

    public void shouldBeAbleToCountTheNamesInTheList () {
        Greet greet = new Greet();
        greet.greetName("zola", "English");
        greet.greetName("charl", "Italian");

        Assertions.assertEquals(greet.counter(), 2);

    }


    @Test

    public void shouldBeAbleToGreetInEnglish() {
        Greet greet = new Greet();

        Assertions.assertEquals(greet.greetName("Kagiso", "English"), "Hello, Kagiso");
    }

    @Test

    public void shouldBeAbleToGreetInChinese() {
        Greet greet = new Greet();

        Assertions.assertEquals(greet.greetName("Kagiso", "Chinese"), "你好, Kagiso");
    }

    @Test

    public void shouldBeAbleToGreetInItalian() {
        Greet greet = new Greet();

        Assertions.assertEquals(greet.greetName("Kagiso", "Italian"), "Ciao, Kagiso");
    }

    @Test

    public void shouldNotAddDuplicates() {
        Greet greet = new Greet();
        greet.greetName("zola", "Italian");
        greet.greetName("zola", "English");

        Assertions.assertEquals(greet.counter(), 1);

    }

    @Test

    public void shouldUpdateTheUserNameIfGreetedMoreThanOnce() {
        Greet greet = new Greet();
        greet.greetName("sivu", "Italian");
        greet.greetName("kagiso", "English");
        greet.greetName("charl", "Chinese");
        greet.greetName("sivu", "Chinese");
        greet.greetName("sivu", "English");
        greet.greetName("kagiso", "Italian");

        Assertions.assertEquals(greet.getUsers().get("kagiso"), 2);
    }
}


