public class Unicorn extends Animal{
    public Unicorn(String n){
        super(n, "marshmallows");
    }

    public void sleep() {
        System.out.println(name + " sleeps in a cloud");
    }
}
