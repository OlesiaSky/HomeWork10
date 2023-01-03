public class Car extends Vehicle{
    public void ShowInfo(){
        System.out.println("Price of car: " + this.getPrice());
        System.out.println("Speed of car: " + this.getSpeed());
        System.out.println("Year of manufacturing: " + this.getYearM());
    }
}
