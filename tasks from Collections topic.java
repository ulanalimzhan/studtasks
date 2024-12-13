1 задача

public class Main {
    enum Colors  {RED, BLUE, GREEN, YELLOW, ORANGE, PURPLE, WHITE, BLACK;
}

    public static void main(String[] args) {
        Colors[] color= Colors.values();
        for (int i = 0; i < color.length; i++) {
            Colors all = color[i];
            System.out.println(all);
        }
}}

2 задача

public class Main {
    enum DaysOfWeek  {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public boolean isWeekday() {
       return this != SATURDAY && this != SUNDAY;}

        public boolean isHoliday() {
        return !isWeekday();
        }}



    public static void main(String[] args) {
        DaysOfWeek[] dayOfWeek = DaysOfWeek.values();
        for (int i = 0; i < dayOfWeek.length; i++) {
            DaysOfWeek HappyDay = dayOfWeek[i];
        if (HappyDay.isWeekday()) {
            System.out.println(HappyDay + " Is a weekday");
        }
        else {
            System.out.println(HappyDay + " Is a Holiday");
        }
        }

    }}

3 задача

public class Main {

    public static void main(String[] args) {
        ToyotaCamry camry= new ToyotaCamry();
        camry.autoIgnition();
        camry.typeOfCar();
    }}


 public abstract class Car {
    public void autoIgnition() {
        System.out.println("The car's started");
    }
    public void drive() {
        System.out.println("The car's riding");}
    // Абстракт класс не является самостоятельным,
    // его мы можем наследовать, и обязуемся реализовать абстракт методы,
    // а обычные методы можно не исполнять.
    // В интерфейсах же по умолчанию методы абстрактные,
    // их надо обязательно реализовать. Также наследуем только 1 абстракт класс, а интерфейсов можно много
    public abstract void typeOfCar();}

public class ToyotaCamry extends Car{
    @Override
    public void typeOfCar() {
        System.out.println("This car is a sedan");
    }
}
===================================
public class Main {

    public static void main(String[] args) {
        ToyotaCamry camry= new ToyotaCamry();
        camry.autoIgnitation();
        camry.typeOfCar();
    }}


public interface Car {
    void autoIgnitation();
    void typeOfCar();
}


public class ToyotaCamry implements Car{
    @Override
    public void autoIgnitation() {
        System.out.println("The car is started");
    }
    @Override
    public void typeOfCar() {
        System.out.println("This car is a sedan");
    }
}



4 задача


import java.util.ArrayList;
import java.util.Iterator;

public class Student {

    public static void main(String[] args) {
        ArrayList<Integer> grade = new ArrayList<>();
        grade.add(10);
        grade.add(4);
        grade.add(7);
        grade.add(2);
        grade.add(5);
   Iterator<Integer> iterator = grade.iterator();
   while (iterator.hasNext()) {
       Integer digit = iterator.next();
       if (digit > 5) {
           System.out.println(digit);
       }}
    }}

5 задача //Сам не смог особо ее решить, часть задачи и ход решения задачи подсмотрел
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Phonebook phoneBook = new Phonebook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Меню:");
            System.out.println("1. Добавить новый контакт");
            System.out.println("2. Просмотреть все контакты");
            System.out.println("3. Обновить информацию о контакте");
            System.out.println("4. Поиск контакта по имени");

            System.out.print("Введите номер нужной вам команды: ");
            int choose = scanner.nextInt();
            scanner.nextLine();

            switch (choose) {
                case 1:
                    System.out.print("Введите имя: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите телефон: ");
                    String phone = scanner.nextLine();
                    phoneBook.addContact(name, phone);
                    break;

                case 2:
                    phoneBook.seeAllContacts();
                    break;

                case 3:
                    System.out.print("Введите имя для обновления: ");
                    String updateName = scanner.nextLine();
                    System.out.print("Введите новый номер телефона: ");
                    String newPhone = scanner.nextLine();
                    if (!phoneBook.updateContact(updateName, newPhone)) {
                        System.out.println("Контакт не найден.");
                    }
                    break;

                case 4:
                    System.out.print("Введите имя для поиска: ");
                    String searchName = scanner.nextLine();
                    phoneBook.searchContact(searchName);
                    break;
            }
        }
    }
}


import java.util.Map;
import java.util.HashMap;

public class Phonebook {
    private Map<String, String> bookOfContacts;

    public Phonebook() {
        bookOfContacts = new HashMap<>();
    }

    public void addContact(String name, String phone) {
        bookOfContacts.put(name, phone);
    }

    public boolean updateContact(String name, String newPhone) {
        if (bookOfContacts.containsKey(name)) {
            bookOfContacts.put(name, newPhone);
            System.out.println("Контакт обновлен.");
            return true;
        } else {
            System.out.println("Контакт не найден для обновления.");
            return false;
        }
    }

    public boolean searchContact(String name) {
        if (bookOfContacts.containsKey(name)) {
            System.out.println("Номер телефона: " + bookOfContacts.get(name));
            return true;
        } else {
            System.out.println("Контакт не найден.");
            return false;
        }
    }

    public void seeAllContacts() {
        if (bookOfContacts.isEmpty()) {
            System.out.println("Телефонная книга пуста.");
        } else {
            for (Map.Entry<String, String> entry : bookOfContacts.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}



6 задача
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Red");
        colors.add("Yellow");
        for (String total : colors) {
            System.out.println(total);
        }
    }
}

7 задача

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> colors1 = new ArrayList<>();
        colors1.add("Blue");
        colors1.add("Red");
        colors1.add("Yellow");
        List<String> colors2 = new ArrayList<>();
        colors2.add("Blue");
        colors2.add("Red");
        colors2.add("Yellow");
        if (colors1.equals(colors2)) {
            System.out.println("Colors are equal");
        }
        else System.out.println("Colors are not equal");

    }
}


8 задача

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.set(1, 5);
        for (Integer number : numbers)
            System.out.println(number);
    }
}

9 задача

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println("Первый элемент вхождения- " + numbers.getFirst()+ " Последний элемент вхождения- " + numbers.getLast());
    }
}

10 задача

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.set(1, 4);
        numbers.set(2, 5);
        System.out.println(numbers);
          }
}

11 задача

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        Set<String> fruits2 = new HashSet<>();
        fruits2.add("apple");
        fruits2.add("watermelon");
        fruits2.add("banana");
        if (fruits.retainAll(fruits2)) {
            System.out.println("Одинаковые элементы: " + fruits);
        }
    }
}

12 задача

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.clear();
        System.out.println(fruits.isEmpty());
        }
    }

13 задача

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,String> drinks = new HashMap();
        drinks.put("Cola","500ml");
        drinks.put("Sprite","1000ml");
        drinks.put("Fanta","250ml");
        Map<String,String> drinks2 = new HashMap();
        drinks2.putAll(drinks);
        System.out.println(drinks2);
        }
    }

14 задача

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,String> drinks = new HashMap();
        drinks.put("Cola","500ml");
        drinks.put("Sprite","1000ml");
        drinks.put("Fanta","250ml");
        System.out.println(drinks.containsValue("1000ml"));
        }
    }      


