package Lib;

public abstract class Animal {
    private final String name; 

    public Animal(String name){
        this.name = name ;
    }
    public String getName(Animal string){
        return this.name ;
    }
    public abstract String makeSound();
}
