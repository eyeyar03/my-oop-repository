public class MyFirstHelloWorld {

    public static void main(String[] args) {
       Bicycle myBicycle = new Bicycle();

        System.out.println(myBicycle.getColor());

        myBicycle.setColor("Yellow");
        myBicycle.setkindOfBreaks("Hyrdaulics");

        System.out.println(myBicycle.getColor());

        Bicycle yourBicycle = new Bicycle();
        yourBicycle.setColor("Red");
        yourBicycle.setkindOfBreaks("disc");

        System.out.println(myBicycle.getColor());
        System.out.println(yourBicycle.getColor());

        Dog myDog = new Dog();
        myDog.eat();

        Chicken myChicken = new Chicken();
        myChicken.eat();


    }
}
