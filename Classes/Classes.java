class Car {
   String color;
   int releaseYear;
   String type;
   public void start()
   {
    System.out.println("Car has been started");
   }
   public void accelerate()
   {
    System.out.println("Accelerating the car!");
   }
   public void stop()
   {
      System.out.println("Brakes have been applied!");
   }

   public int giveSpeed()
   {
     int speed =(int)  Math.round(Math.random()*100) ;
     return speed;
   }
}
public class Classes
{
    public static void main(String args[]) {
        Car fortuner = new Car();
        fortuner.color = "burgundy";
        fortuner.releaseYear = 2016;
        fortuner.type = "SUV";
        fortuner.start();
        fortuner.accelerate();
        fortuner.stop(); 
        int speed = fortuner.giveSpeed();
        System.out.println(speed+"km/h");
    }
}