package ua.zp.brainacad;

public class Pizza {
    //    2 Создание комплексного класса.
//2.1 Создать класс Pizza. Описать поля:
//    basis – поле типа Circle
//    composition – состав пиццы
//    name – название пиццы
//    cost – цена.
//2.2 Создать конструктор, который принимает в качестве параметров имя, состав, цену и
//    диаметр пиццы. Внутри конструктора создать объект класса Circle применив диаметр.
//            2.3 Создать класс Pizzeria c методом main в котором создать массив из разных пицц.
//2.4 Вывести в цикле информацию о каждой пицце.
//2.5 Написать JavaDoc для всех классов.
    /**
     * Class Pizza that consist some private fields: basic (type Circle), composition, name, cost
     */
    private Circle basic;
    private String composition;
    private String name;
    private int cost;

    /**
     * Declaration constructor  Pizza() with parameter name, composition, cost, diameter
     */
    public Pizza(String name, String composition, int cost, int diameter) {
        this.name = name;
        this.composition = composition;
        this.cost = cost;
        /**
         * Set to variable basic object of class Circle() with parameter radius
         */
        basic = new Circle(diameter / 2);
    }

    /**
     * Declaration method which out to console objects parameters of pizza: name, composition, cost, diameter
     */
    public void pizzaInfo() {
        System.out.println("Name: " + name);
        System.out.println("Composition: " + composition);
        System.out.println("Cost: " + cost);
        System.out.println("Diameter: " + basic.getDiameter());
    }

}
