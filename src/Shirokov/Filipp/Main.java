package Shirokov.Filipp;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
	List<Person> list = new ArrayList<>();
	Person person1 = new Person(true, "Ivan");
	Person person1Wife = new Person(false, "Julia");
        System.out.println(person1.marry(person1Wife));
        System.out.println(person1.getSpouse().getName());
        System.out.println(person1Wife.getSpouse().getName());
        System.out.println(person1.marry(person1Wife));
    Person person2 = new Person(true, "Ivan2");
    Person person2Wife = new Person(false, "Julia2");
        System.out.println(person2.marry(person2Wife));
        System.out.println(person2.getSpouse().getName());
        System.out.println(person2Wife.getSpouse().getName());

        System.out.println(person1.marry(person2Wife));
        System.out.println(person1.getSpouse().getName());
        System.out.println(person1Wife.getSpouse());
        System.out.println(person2Wife.getSpouse().getName());
        System.out.println(person2.getSpouse());
    }
}
