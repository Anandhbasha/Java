public class Abstract {
    public static void main(String[] args) {
        Car myCar = new Tesla();
        myCar.start();       // only care about calling method
        myCar.accelerate();  // doesn't know internal motor logic
        myCar.brake();       // doesn't know regenerative brake design
    }
}
abstract class Car {
    abstract void start();
    abstract void accelerate();
    abstract void brake();
}


class Tesla extends Car {
    void start() {
        System.out.println("Tesla starts silently using electric motor 🔋");
    }
    void accelerate() {
        System.out.println("Tesla accelerates using electric power ⚡");
    }
    void brake() {
        System.out.println("Tesla brakes using regenerative braking 🛑");
    }
}

