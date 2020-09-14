package ua.zp.brainacad;

public class Main {

    public static void main(String[] args) {
//9.Конструктор (Практика)
//        1 Создание класса с конструктором
//        1.1 Создать класс Circle. Описать поля: радиус длинна окружности, площадь, цвет.
//        Создать 2 конструктора, в которые передавать параметры: радиус, и цвет и радиус.
//        1.2 Параметры площадь и длинна окружности расcчитать в конструкторе на основе
//        радиуса и Pi. Примечание число PI можно взять из класса Math, Math.PI.
//        1.3 Создать метод main, в котором создать экземпляр класса Circle. Вывести на экран
//        сообщение с данными о длинне окружности, площади и цвета.
        /**
         * Create objects of class Circle by calling different constructor
         */
        Circle circle1 = new Circle(10);
        Circle circle2 = new Circle("green", 20);
        /**
         * Call method circleInfo() for objects of class Circle
         */
        circle1.circleInfo();
        circle2.circleInfo();


    }
}
