public class AnimalDriver {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal bird = new Bird();

        System.out.println(dog.makeSound());
        System.out.println(dog.move());

        System.out.println(bird.makeSound());
        System.out.println(bird.move());

        Dog specificDog = new Dog();
        String homework = specificDog.misbehave("homework");
        System.out.println(homework);
    }
}