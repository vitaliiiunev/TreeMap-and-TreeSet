import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Петя", "Васечкин", 18));
        people.add(new Person("Коля", "Петров", 17));
        people.add(new Person("Маша", "Железнова", 40));
        people.add(new Person("Ирина", "Мамонтова",35));

        System.out.println(people);
        Collections.sort(people, new PersonsNameLength());
        System.out.println(people);
    }
}
