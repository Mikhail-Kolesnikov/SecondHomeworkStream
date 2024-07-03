import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Car vw = new Car("VW", 2004, 200_000);
        Car volga = new Car("Volga", 1990, 758_000);
        Car tesla = new Car("Tesla", 2022, 30_254);
        Car bmw = new Car("BMW", 1995, 370_498);
        Car mercedes = new Car("Mercedes", 1984, 1_156_675);
        Car niva = new Car("Niva", 1991, 678_564);
        Car wey = new Car("Wey", 2015, 456_000);
        Car wartburg = new Car("Wartburg", 2023, 15_000);

        List<Car> cars = new ArrayList<>();
        cars.add(vw);
        cars.add(volga);
        cars.add(tesla);
        cars.add(bmw);
        cars.add(mercedes);
        cars.add(niva);
        cars.add(wey);
        cars.add(wartburg);

        Optional<Integer> result = cars.stream()
                .filter(x -> x.getDate() > 1999)
                .map(x -> x.getOdo())
                .reduce((x, y) -> x + y);
        System.out.println(result.get());

        Optional<Car> result2 = cars.stream()
                .filter(y -> y.getOdo() > 500_000)
                .min(Comparator.comparingInt(x -> x.getDate()));

        System.out.println(result2.get());

        List<Car> result3 = cars.stream()
                .filter(x -> x.getType().startsWith("W"))
                .filter(x -> x.getOdo() <= 200_000)
                .toList();
        System.out.println(result3);


    }
}


////1.1 Создайте класс "Машина"
////1.2 Добавьте в этот класс 3 поля: наименование марки, год выпуска и пробег
////
////2.1. Среди машин, которые имеют год выпуска новее, чем 1999, необходимо подсчитать общий пробег
////2.2. Среди машин, у которых пробег более 500 000, найти самую старую машину
////2.3. Среди машин, у которых марка начинается на "V" или "W", найти с самым большим пробегом, но не более 200 000 тысяч


