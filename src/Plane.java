public class Plane extends Vehicle{
    int Alt;
    int Passengers;

    public int getAlt() {
        return Alt;
    }

    public void setAlt(int alt) {
        Alt = alt;
    }

    public int getPassengers() {
        return Passengers;
    }

    public void setPassengers(int passengers) {
        Passengers = passengers;
    }
    public void ShowInfo(){
        System.out.println("Price of plane: " + this.getPrice());
        System.out.println("Speed of plane: " + this.getSpeed());
        System.out.println("Year of manufacturing: " + this.getYearM());
        System.out.println("Altitude of plane: " + this.getAlt());
        System.out.println("Number of passengers: " + this.getPassengers());
    }
}
