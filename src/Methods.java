public class Methods {

    public static void main(String[] args){
        // Intro to classes and objects

        Ball football = new Ball("blue", "Football", 15);
        football.showColor();
        Ball baseball = new Ball("red", 10);

        Ball ball = new Ball();

        ball.setName("Yangi koptok");
        System.out.println(ball.getName());

        ball.setColor("orange");
        System.out.println(ball.getColor());

        ball.setCapacity(19);
        System.out.println(ball.getCapacity());


        Basketball basketball = new Basketball();
        basketball.bouncing();

        basketball.basketSize = 100;
        System.out.println(basketball.basketSize);

        basketball.setColor("ola-bula");
        System.out.println(basketball.getColor());


        //access modifiers
        //constructor
        //getter and setter
        //overloading constructors
        //inheritance
        //override

        // void = means method has no return value
        // void = hech qanday turdagi qiymatni qaytarmaydi
        // static = means the method is associated with class



//        Ball basketball = new Ball();
//        football.name = "Football";
//        football.color = "Blue";
//        football.capacity = 10;
//        football.Bouncing();
//
//        basketball.name = "Basketball";
//        basketball.color = "Blue";
//
//
//        System.out.println(football.name);
//        System.out.println(basketball.name);

    }

}
