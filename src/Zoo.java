public class Zoo {
    public static void main(String[] args) {
        Tiger tigger = new Tiger("Tigger");
        Bear pooh = new Bear("Pooh");
        tigger.eat("meat");
        pooh.eat("fish");
        pooh.eat("kibble");
        Unicorn Rarity = new Unicorn("Rarity");
        Rarity.eat("marshmallows");
        Giraffe Gemma = new Giraffe("Gemma");
        Gemma.eat("leaves");
        Bee Stinger = new Bee("Stinger");
        Stinger.eat("Pollen");
        Animal[] animals = {tigger, pooh, Rarity, Gemma, Stinger};
        Zookeeper Zoebot = new Zookeeper("Zoebot");
        Zoebot.feedAnimals(animals, "leaves");


    }

}



