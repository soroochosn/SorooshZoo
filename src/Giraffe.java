public class Giraffe extends Animal{
    public Giraffe(String n){
        super(n, "leaves");
    }
    public void eat(String food){
        System.out.println(name + " eats " + food );
        if(food==favoriteFood){
            System.out.println("YUM!!! "+ name + " wants more "+ favoriteFood);
            sleep();
        }else{
            System.out.println("YUCK!! " + name + " will not eat" + food);
        }
    }


}
