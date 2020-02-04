import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();
        Car userCar = new Car();
        String creatCar = "y";


          System.out.println("Please enter a color:");
          userCar.setColor(sc.nextLine());
          System.out.println("Please enter a Make: ");
          userCar.setMake(sc.nextLine());
          System.out.println("Please enter speed: ");
          userCar.setSpeed(sc.nextInt());



        for(Car car: cars){
            System.out.println(car.description());
        }


        Car c = new Car("red", "BMW", 87);
        Car c1 = new Car("Blue", "FORD", 25);

        cars.add(userCar);
        cars.add(c);
        cars.add(c1);

        for(Car car: cars){
            System.out.println(car.description());
        }
     //System.out.println(c.accelerating());
     //System.out.println(c1.accelerating());
      //System.out.println(c.starting());
        //System.out.println(c1.starting());
      // c.speed();
       //c1.speed();
   }
}
