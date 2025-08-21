package polymorphism;

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
