public class CarApp {
    public static void main(String[] args){
        Car c = new Car("red", "BMW", 87);
        Car c1 = new Car("Blue", "FORD", 25);

        System.out.println(c.accelerating());
        System.out.println(c1.accelerating());
        System.out.println(c.starting());
        System.out.println(c1.starting());
       c.speed();
       c1.speed();
    }
}
