package Lib;

public class Lion extends Mammal implements Swimable{

    public Lion(String name) {
        super(name);
    }

    public String makeSound(){
        return "Roar!";
    }

    @Override
    public String swim() {
        return "The Lion is walking!!";
    }
}
