package ua.zp.brainacad;

//9.Конструктор (Практика)
//        1 Создание класса с конструктором
//        1.1 Создать класс Circle. Описать поля: радиус длинна окружности, площадь, цвет.
//        Создать 2 конструктора, в которые передавать параметры: радиус, и цвет и радиус.
//        1.2 Параметры площадь и длинна окружности расcчитать в конструкторе на основе
//        радиуса и Pi. Примечание число PI можно взять из класса Math, Math.PI.
//        1.3 Создать метод main, в котором создать экземпляр класса Circle. Вывести на экран
//        сообщение с данными о длинне окружности, площади и цвета.
public class Circle {
    /**
     * Class Circle that consist some private fields: radius, circumference, area, colour
     */
    private int radius;
    private double circumference;
    private double area;
    private String colour;

    /**
     * Declaration constructor Circle() with parameter radius
     */
    public Circle(int radius) {
        this.radius = radius;
        /**
         * Call static methods: circumference() and area();
         */
        circumference = circumference(radius);
        area = area(radius);
        colour = "red";
    }

    /**
     * Declaration constructor Circle() with parameter colour and radius
     */
    public Circle(String colour, int radius) {

        /**
         * Call constructor Circle() with parameter radius
         */
        this(radius);
        this.colour = colour;
    }

    /**
     * Declaration method which out to console objects parameters: radius, circumference, area, colour
     */
    public void circleInfo() {
        System.out.println("Radius: " + radius);
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);
        System.out.println("Colour: " + colour);
    }
    /**
     * Declaration method which return variable - diameter of circle
     */
    public int getDiameter() {
        return radius * 2;
    }
    /**
     * Declaration static method which return variable - circumference
     */
    public static double circumference(int radius) {
        return 2 * Math.PI * radius;
    }

    /**
     * Declaration static method which return variable - area of circle
     */
    public static double area(int radius) {
        return Math.PI * (radius ^ 2);
    }

}
