//1 задача

public class Main {

    public static void main(String[] args) {
    Student student1 = new Student("Dima", 22);
        System.out.println("Имя студента: " + student1.getName() + ", Айди студента: " + student1.getId() + ", Стаж обучения: " + student1.getStudyAge());
        student1.uppStudyAge();
        System.out.println("Имя студента: " + student1.getName() + ", Айди студента: " + student1.getId() + ", Стаж обучения: " + student1.getStudyAge());
    }}


class Student {
    private String name;
    private int id;
    private int studyAge;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.studyAge = 0;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public int getStudyAge() {
        return studyAge;
    }
    public void uppStudyAge() {
        this.studyAge++;
    }
}


//2 задача

public class Main {

    public static void main(String[] args) {
    StarTriangle triangle = new StarTriangle(3);
        System.out.println(triangle.toString());}}


class StarTriangle {
    int width;

    StarTriangle (int width) {
        this.width = width;
    }
    public String toString() {
        String result = "";
        for (int i=1; i <= width; i++){
        for (int j=0; j < i; j++){
            result= result + "[*]";
        }
        result= result + "\n";
        }
        return result;
    }
}


//3 задача

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Square square1 = new Square();
    Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, которое будет длиной стороны квадрата");
        int n= scanner.nextInt();
        System.out.println("Диагональ составляет "+square1.findDiagonal(n));
        System.out.println("Периметр составляет "+square1.findPerimeter(n));
        System.out.println("Площадь составляет "+square1.findArea(n));
    }
}

class Square {
    double findDiagonal(int n) {
       return Math.sqrt(2) * n;
    }
    double findPerimeter(int n) {
        return n+n+n+n;
    }
    double findArea(int n) {
        return n*n;
    }
}



//4 задача


public class Main {

    public static void main(String[] args) {
        Temperature Temp1 = new Temperature(273.15, 'F');
        System.out.println(Temp1.getTemperatureInC());

    }
}

class Temperature {
    private double temperature;
    private char type;

    Temperature(double temperature, char type) {
        this.temperature = temperature;
        this.type = type;
    }
    Temperature(double temperature) {
        this.temperature = temperature;
        this.type = 'C';
    }
    Temperature(char type) {
        this.temperature = 0;
        this.type = type;
    }
    Temperature() {
        this.temperature = 0;
        this.type = 'C';
    }

    double getTemperature() {
        return temperature;
    }
    char getType() {
        return type;
    }
    double getTemperatureInC() {
        if (type == 'F') {
            return (temperature - 32) * 5 / 9;
        }
        else return temperature;
    }
    double getTemperatureInF() {
        if (type == 'C') {
            return (temperature * 9 / 5) + 32;
        }
        else return temperature;
    }
    void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    void setType(char type) {
        this.type = type;
    }
    void setTemperatureAndType(double temperature, char type) {
        this.temperature = temperature;
        this.type = type;
    }
}

