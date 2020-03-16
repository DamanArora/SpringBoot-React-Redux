package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static imperative.Main.Gender.MALE;
import static imperative.Main.Gender.FEMALE;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", Gender.MALE),
        new Person("Maria", FEMALE),
        new Person("Aisha", FEMALE),
        new Person("Alex", MALE),
        new Person("Alice", FEMALE)
        );

        //imperetive approach
        //it uses a lot is lines to write simple code
        /*List<Person> females = new ArrayList<Person>();
        for(Person person : people){
            if(Gender.FEMALE.equals(person.gender)){
                females.add(person);
            }
        }

        for(Person female : females){
                System.out.println(female);
        }*/

        //Declerative approach
        /*people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                .collect(Collectors.toList()).forEach(System.out::println);*/

        //More Declerative
        List<Person> fetchFemales = people.stream().filter(person -> FEMALE.equals(person.gender)).collect(Collectors.toList());
        System.out.println(fetchFemales);
        //OR
        fetchFemales.forEach(System.out::println);
    }

    static class Person{
        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }

        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }
    }

    enum Gender{
        MALE, FEMALE
    }
}


