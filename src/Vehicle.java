public class Vehicle {
    /*У тілі класу створіть поля: координати та параметри суден (ціна, швидкість, рік випуску).
    Створіть 3 похідних класи Plane, Саг та Ship.
    Для класу Plane має бути визначена висота та кількість пасажирів.
    Для класу Ship – кількість пасажирів та порт приписки.
    Написати програму, яка виводить на екран інформацію про кожен засіб пересування.
     */
    int Price;
    int Speed;
    int YearM;

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    public int getYearM() {
        return YearM;
    }

    public void setYearM(int yearM) {
        YearM = yearM;
    }
}
