public class Ship extends Vehicle{
    int Passengers;
    String Port;

    public int getPassengers() {
        return Passengers;
    }

    public void setPassengers(int passengers) {
        Passengers = passengers;
    }

    public String getPort() {
        return Port;
    }

    public void setPort(String port) {
        Port = port;
    }
    public void ShowInfo(){
        System.out.println("Price of ship: " + this.getPrice());
        System.out.println("Speed of ship: " + this.getSpeed());
        System.out.println("Year of manufacturing: " + this.getYearM());
        System.out.println("Port of ship: " + this.getPort());
        System.out.println("Number of passengers: " + this.getPassengers());
    }
}
