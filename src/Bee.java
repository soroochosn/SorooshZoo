public class Bee extends Animal {
    public Bee(String n){
        super(n, "Pollen");
    }
    public void sleep(){
        System.out.println(name + " never sleeps");
    }

    public void eat(String food){
        System.out.println(name + " eats " + food );
        if(food==favoriteFood){
            System.out.println("YUM!!! "+ name + " wants more "+ favoriteFood);
            sleep();
        }else{
            System.out.println("YUCK!! " + name + " will not eat " + food);
        }
    }
}
