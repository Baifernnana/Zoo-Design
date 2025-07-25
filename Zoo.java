import java.util.ArrayList;
import Lib.*;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Lion("Lion"));
        animals.add(new Eagle("Eagle"));
        animals.add(new Penguin("Penguin"));
        animals.add(new Dolphin("Dolphin"));

        for(Animal animal : animals){ 
            System.out.println("name : "+animal.getName(animal)+" and Sound : "+animal.makeSound());
        }
        for(Animal animal : animals){ 
            if(animal instanceof Flyable){
                Flyable fly = (Flyable) animal;
                System.out.println("Name : "+animal.getName(animal)+" can "+fly.fly());
            }
            else if(animal instanceof Swimable){
                Swimable swim = (Swimable) animal;
                System.out.println("Name : "+animal.getName(animal)+" can "+swim.swim());
            }
            else{
                System.out.println("Dont have talent only running!!!");
            }

        }
        
    }
}
