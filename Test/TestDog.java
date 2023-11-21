import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDog {
    @Test
    public void testDogMakeSound() {
        Dog dog = new Dog();
        assertEquals("Bark", dog.makeSound());
    }

    @Test
    public void testDogMove() {
        Dog dog = new Dog();
        assertEquals("I'm running!", dog.move());
    }

    @Test
    public void testDogMisbehave() {
        Dog dog = new Dog();
        assertEquals("I chewed up your homework", dog.misbehave("homework"));
    }
}