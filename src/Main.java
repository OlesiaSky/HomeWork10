public class Main {
    public static void main(String[] args) {
    Car car = new Car();
    car.setPrice(10000);
    car.setSpeed(200);
    car.setYearM(2019);
    car.ShowInfo();

        System.out.println();

    Plane plane = new Plane();
    plane.setPrice(1000000);
    plane.setSpeed(900);
    plane.setYearM(2021);
    plane.setAlt(10000);
    plane.setPassengers(100);
    plane.ShowInfo();

        System.out.println();

    Ship ship = new Ship();
    ship.setPrice(1000000);
    ship.setSpeed(40);
    ship.setYearM(2021);
    ship.setPort("Monaco");
    ship.setPassengers(200);
    ship.ShowInfo();

    }
}