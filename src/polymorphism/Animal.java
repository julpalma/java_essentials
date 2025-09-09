package polymorphism;

//The ability for an object or function to take many different forms.
//It helps reduce complexity and write reusable code.
//Java supports runtime and compile-time polymorphism.

public class Animal {

    public void makeSound() {
        System.out.println("Unknown animal sound.");
    }

    public void fetch() {
        System.out.println("Fetch is fun!!!");
    }

    public void feed(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println("Dog food");
        } else if (animal instanceof Cat){
            System.out.println("Cat food");
        }
    }

}
