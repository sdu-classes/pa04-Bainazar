public class Rabbit extends Animal implements Pet {
    private String name;

    public Rabbit(String name) {
        super(4);
        this.name = name;
    }

    public Rabbit() {
        this("Kitty");
    }

   
    public void eat() {
        System.out.println("A cat named " + this.name + " is eating kitekat!");
    }

    
    public String getName() {
        return this.name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

   
    public void play() {
        System.out.println("A rabbit named " + this.name + " is playing!");
    }
}
