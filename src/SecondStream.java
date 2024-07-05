import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class SecondStream {

    public static void main(String[] args) {
        Person oleg = new Person("Oleg", "Marina", "Fedor");
        Person vlad = new Person("Vlad", "Elena", "Igor");
        Person ivan = new Person("Ivan", "Karolina", "Evlampii");
        Person sergey = new Person("Sergey", "Antonina", "Alexandr");

        List<Person> persons = new ArrayList<>();
        persons.add(oleg);
        persons.add(vlad);
        persons.add(ivan);
        persons.add(sergey);

        List<String> res = persons.stream()
                .flatMap(x -> Stream.of(x.getFather(), x.getMother()))
                .filter(str -> str.length() > 6)
                .toList();

        System.out.println(res);


    }

    //ist<Integer> integer = strings.stream()
    //                .map(str -> str.length())
    //                .filter(x -> x % 2 == 0)
    //                .toList();
    //        System.out.println(integer);
    //
    //        //найти те имена, которые имеют четное колво букв
    //
    //        List<String> names = strings.stream()
    //                .filter(str -> str.length() % 2 == 0)
    //                .toList();
    //        System.out.println(names);
}


//. Создайте класс Person
//1.2 Добавьте в этот класс 3 поля: имя, папа и мама. Папа и мама - тоже поля класса Person
//2.1. У вас есть список из людей, найдите среди них всех их мам и пап, у которых имя длиннее 6 букв
//
//Подскажка: Делайте либо через Stream.of(), либо делаем по отдельности (способ Владимира)
//
//Дополнение: важно поработать со стримами, но разрешается где-то какое-то действие выполнить без них
