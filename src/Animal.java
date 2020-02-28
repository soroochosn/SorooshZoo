public class Animal {
        // Put your properties here

    String favoriteFood;
    String name;
    static int population;

    public Animal(String name, String favoriteFood) {
        this.name = name;
        this.favoriteFood = favoriteFood;
        population++;
    }


    public void sleep() {
        System.out.println(name + " sleeps for 8 hours");
    }

    public void eat(String food){
        System.out.println(name + " eats " + food);
        if(food==favoriteFood){
            System.out.println("YUM!!! "+ name + " wants more "+ favoriteFood);
        }else{
            sleep();
        }
    }
}


