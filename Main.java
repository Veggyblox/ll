// Parent class
class Animal {
    // METHOD OVERRIDING: This is the base method in the parent class
    public void sound() {
        System.out.println("Animal makes a generic sound.");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    
    // 1. METHOD OVERRIDING
    // The child class provides its own specific implementation of the parent's 'sound' method
    @Override
    public void sound() {
        System.out.println("Dog barks: Woof! Woof!");
    }

    // 2. METHOD OVERLOADING
    // Same method name 'displayInfo' with different parameters (compile-time polymorphism)
    
    // Overloaded method with one parameter
    public void displayInfo(String breed) {
        System.out.println("Dog Breed: " + breed);
    }

    // Overloaded method with two parameters
    public void displayInfo(String breed, int age) {
        System.out.println("Dog Breed: " + breed + ", Age: " + age + " years");
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Demonstrating Method Overriding & Overloading ===\n");

        // Testing Method Overriding
        System.out.println("--- Method Overriding Test ---");
        Animal genericAnimal = new Animal();
        genericAnimal.sound(); // Calls the parent class method

        Dog myDog = new Dog();
        myDog.sound(); // Calls the overridden method in the Dog class

        // Testing Method Overloading
        System.out.println("\n--- Method Overloading Test ---");
        myDog.displayInfo("Golden Retriever");           // Calls the 1-parameter method
        myDog.displayInfo("German Shepherd", 3);       // Calls the 2-parameter method
    }
}
