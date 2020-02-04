public class Car {
private String color;
private String make;
private int speed;


public Car(){

}

public Car(String color,String make,int speed){
    this.color = color;
    this.make = make;
    this.speed = speed;

}

public String starting(){
    return "The " + this.color +" "+ this.make +" is starting";
}

public String accelerating(){
    return "The " + this.color + " " + this.make +" is accelerating";
}

public void speed(){
    System.out.println("The " + this.color + " " +this.make + " is going "+ this.speed + " hpm");
}

public String description(){
    return "This is a " + this.color +"  "+ this.getMake() + " and is going at "+this.getSpeed() + " hpm";
}


public String getColor(){
    return this.color;
}

public void  setColor(String color){
    this.color = color;
}

public String getMake(){
    return this.make;
}

public void setMake(String make){
    this.make = make;
}

public int getSpeed(){
    return this.speed;
}

public void setSpeed(int speed){
    this.speed = speed;
}


}
