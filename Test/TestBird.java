import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBird {
    @Test
    public void testBirdMakeSound() {
        Bird bird = new Bird();
        assertEquals("Chirp", bird.makeSound());
    }

    @Test
    public void testBirdMove() {
        Bird bird = new Bird();
        assertEquals("I am flying", bird.move());
    }
}