public class Main {

    public static void main(String[] args) {

        // method overriding = declaring a method in sub class, 7
        // which is already present in parent class.
        // done so that a child class can give its own implementation

        Animal animal = new Animal();

        Dog dog = new Dog();

        animal.speak();
        dog.speak();

    }
}