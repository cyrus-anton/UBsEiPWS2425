// Die einzelnen Klassen/Interfaces können auch in eigenen Dateien stehen.
// Sie sind hier zur besseren Handhabbarkeit in einer Datei zusammengefasst.

public class Modelling {
    // The introductions in between are giving the story the output
    public static void main(String[] args) {
      
    }
}



interface Animal {
    public String noise();
    public String name();

    public default void introduction() {
        System.out.printf("%s! Mein Name ist %s.\n", noise(), name());
        furtherIntroduction();
    }

    public default void furtherIntroduction() {}
}




// Could be also done with an Interface, but then the logic of
// selling would need to be implemented always new
// -> A weakness of Java's interfaces is to not support variables
// like Kotlin does for example
abstract class DomesticAnimal implements Animal {
    private String owner;

    public DomesticAnimal(String owner) {
        this.owner = owner;
    }

    public void sellTo(String newOwner) {
        owner = newOwner;
    }

    @Override
    public void furtherIntroduction() {
        System.out.printf("Ich gehöre %s.\n", owner);
    }
}




interface Predator extends Animal {
    @Override
    public default void furtherIntroduction() {
        System.out.println("Achtung, ich bin ein Raubtier!");
    }
}




class Wolf implements Predator {

    private final String name;

    public Wolf(String name) {
        this.name = name;
    }

    @Override
    public String noise() {
        return "HEUL";
    }

    @Override
    public String name() {
        return name;
    }
}




class Sheep extends DomesticAnimal {
    private final String name;

    public Sheep(String name, String owner) {
        super(owner);
        this.name = name;
    }

    @Override
    public String noise() {
        return "BAA";
    }

    @Override
    public String name() {
        return name;
    }
}




class Mouse implements Animal {

    private final String name;

    public Mouse(String name) {
        this.name = name;
    }
    @Override
    public String noise() {
        return "PFIEP";
    }

    @Override
    public String name() {
        return name;
    }
}




// There could be an abstract class like `DomesticPredator`
// if we have multiple of such animals.
// Then we would not need to override `furtherIntroduction`
// in every such animal.
class Cat extends DomesticAnimal implements Predator  {

    private final String name;

    public Cat(String name, String owner) {
        super(owner);
        this.name = name;
    }

    @Override
    public String noise() {
        return "MIAU";
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public void furtherIntroduction() {
        super.furtherIntroduction();
        Predator.super.furtherIntroduction();
    }
}
