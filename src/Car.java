import java.util.Objects;

public class Car {

    private String type;

    private int date;

    private int odo;


    public Car(String type, int date, int odo) {
        this.type = type;
        this.date = date;
        this.odo = odo;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", date=" + date +
                ", odo=" + odo +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getOdo() {
        return odo;
    }

    public void setOdo(int odo) {
        this.odo = odo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return date == car.date && odo == car.odo && Objects.equals(type, car.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, date, odo);
    }
}



//1.1 Создайте класс "Машина"
//1.2 Добавьте в этот класс 3 поля: наименование марки, год выпуска и пробег
//
//2.1. Среди машин, которые имеют год выпуска новее, чем 1999, необходимо подсчитать общий пробег
//2.2. Среди машин, у которых пробег более 500 000, найти самую старую машину
//2.3. Среди машин, у которых марка начинается на "V" или "W", найти с самым большим пробегом, но не более 200 000 тысяч