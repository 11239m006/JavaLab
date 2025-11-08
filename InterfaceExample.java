// Interface
interface Animal {
    void sound();   // method without body
}

// Class implementing interface
class Dog implements Animal {
    public void sound() {          // must use 'public'
        System.out.println("Dog barks");
    }
}

// Main class
public class InterfaceExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
