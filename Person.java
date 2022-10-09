package Home_Tasks.HT_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Person implements Comparable<Person> //Обобщаем то,что сравниваем - двух Person
{
    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String name, int age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}' + '\n';
    }

    @Override
    public int compareTo(Person o) {
//        return this.name.compareTo(o.name);     //#1 Сортировка по имени по алфавиту

//        return o.name.compareTo(this.name);     //#2 Сортировка по имени по алфавиту в обратную

//        if (o.name.compareTo(this.name) == 0) {     //#3 Сортировка по имени и по возрасту, если есть одинаковые имена
//            if (this.age > o.age) return 1;         //
//            else if (this.age == o.age) return 0;   //
//            else return -1;                         //
//        }                                           //
//        return this.name.compareTo(o.name);         //

//        return  Integer.compare(this.age, o.age);     //#5 Сортировка по имени по алфавиту
//        return  Integer.compare(o.age, this.age);     //#6 Сортировка по имени по алфавиту в обратную
        return  Integer.compare(this.height, o.height); //#7 Сортировка по имени по высоте

    }

    public static void main(String[] args) {
        ArrayList<Person> peoples = new ArrayList<>();
        peoples.add(new Person("Дима", 12, 45, 183));
        peoples.add(new Person("Витя", 32, 76, 196));
        peoples.add(new Person("Аня", 46, 55, 166));
        peoples.add(new Person("Юра", 27, 80, 158));
        peoples.add(new Person("Витя", 40, 86, 156));
        peoples.add(new Person("Дима", 33, 77, 177));
        Collections.sort(peoples); //#1 #2 #3 Сортировка по Comparable без Comprator

//        peoples.sort(new Comparator<Person>() {                           //#4 Сортировка через Comprator
//            @Override                                                     //
//            public int compare(Person o1, Person o2) {                    //
//                return Integer.compare(o1.height, o2.height);             //
//            }                                                             //
//        });

//        peoples.sort((o1, o2) -> {return Integer.compare(o1.height, o2.height);});  //#4 lambda вариант

//        for (Person people : peoples) {                                              //#4 Сортировка через Comprator
//            System.out.println(people);                                              //
//        }                                                                            //
//    }                                                                                //
        System.out.println(peoples);    //#1 #2 #3 Сортировка по Comparable без Comprator
    }
}

