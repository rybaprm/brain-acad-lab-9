package ua.zp.brainacad;

public class Pizzeria {
    public static void main(String[] args) {
        /**
         * Create array pizzas which consist of objects of class Pizza
         */
        Pizza[] pizzas = {new Pizza("Margherita", "Tomatoes, cheese, basil", 100, 60),
                new Pizza("Vegetaria", "Tomatoes, pepper, basil,cheese", 80, 80),
                new Pizza("Four season", "Cheese, meat, Tomatoes, pepper, mushrooms", 120, 90)};
        /**
         * Create cycle for each and call method pizzaInfo() for all objects in array pizzas
         */
        for (Pizza pizza : pizzas) {
            pizza.pizzaInfo();
        }
    }
}
