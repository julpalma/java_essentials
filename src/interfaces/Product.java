package interfaces;

public interface Product {

    String getName();
    void setName(String name);

    //Classes that implements Interfaces can override default methods
    default double getPrice() {return 50;};


}
