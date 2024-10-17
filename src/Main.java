abstract class animal {
    protected int legs;

    // konstruktor
    protected animal(int legs) {
        this.legs=legs;
    }

    public void walk() {
        System.out.println("berjalan dengan " + legs+ " kaki");
    }
    public abstract void eat();

}

class spider extends animal {

    // konstruktor
    public spider() {
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("laba-laba makan serangga");
    }
}

interface Pet {
    String getName();
    void setName(String name);
    void play();
}

class Cat extends animal implements Pet {
    String name;

    // Konstruktor tanpa parameter
    public Cat(String name) {
        super(4);
        this.name = name;
    }

    // Mehods
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(name + " playing");
    }

    @Override
    public void eat() {
        System.out.println("nyam nyam");
    }
    
}

class Fish extends animal implements Pet {
    String name;

    // konstruktor
    public Fish() {
        super(0);
    }

    // Method
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("blub blub");
    }

    @Override
    public void walk() {
        System.out.println("I am swimming");
    }

    @Override
    public void eat() {
        System.out.println("hawp hawp");
    }

}

public class Main {
    public static void main(String[] args) {
        System.out.println("\nSpider\n==============");
        spider laba_laba = new spider();
        laba_laba.walk();
        laba_laba.eat();

        System.out.println("\nCat\n==============");
        Cat kucing = new Cat ("oyen");
        kucing.walk();
        kucing.eat();
        kucing.play();

        System.out.println("\nFish\n==============");
        Fish ikan = new Fish();
        ikan.setName("dory");
        ikan.walk();
        ikan.eat();
        ikan.play();
    }

}