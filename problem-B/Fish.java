public class Fish extends Animal implements Pet {
    private String name;

    public Fish(String name) {
        super(0);
        this.name = name;
    }

    public Fish() {
        this("Nemo");
    }
    
    public void eat() {
        System.out.println("Fish named " + this.name + " is eating!");
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("Fish named " + this.name + " is playing!");
    }

    public void walk() {
        throw new UnsupportedOperationException("The fish can't walk!");
    }
}
