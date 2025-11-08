// First interface
interface Animal {
    void eat();
}

// Second interface
interface Pet {
    void play();
}

// Class implementing both interfaces
class Dog implements Animal, Pet {
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void play() {
        System.out.println("Dog is playing");
    }
}

// Main class
public class MultipleInheritance{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.play();
    }
}
