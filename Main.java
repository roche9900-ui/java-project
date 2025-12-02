// program to calculate the fine for overdue library books
/* 
  *Ferdinand Roche
  *K63-11550-2024
  *Program to demonstrate inheritance
*/


class Vehicle {
    String brand;
    int year;
}
class Car extends Vehicle {
    int seats;
}
class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.year = 2017;
        myCar.seats = 4;

        System.out.println("Car Details:");
        System.out.println("Brand: " + myCar.brand);
        System.out.println("Year: " + myCar.year);
        System.out.println("Seats: " + myCar.seats);
    }

}