package com.isabella.lektion2;

import com.isabella.lektion2.uppgift2.Discount;
import com.isabella.lektion2.uppgift2.DiscountTenProcent;
import com.isabella.lektion2.uppgift2.Item;
import com.isabella.lektion2.uppgift2.Order;
import com.isabella.lektion2.uppgift4.Bird;
import com.isabella.lektion2.uppgift4.Dog;
import com.isabella.lektion2.uppgift4.IAnimal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //UPPGIFT 2
        /*La till item som objekt istället för upprepning genom item klassen
        * item klass = Variabler + constructor + gettersetter + metod för total priset*/
        Item item1 = new Item("Laptop", 1000.00, 1);
        Item item2 = new Item("Phone", 500.00, 2);

        /*Istället för hårdkodad rabatt kod skapade jag en interface discount
        * och sedan en discounttenprocent för logiken via interfacet (mestadels ifall man
        * vill byta rabatt/discount)*/
        Discount discount = new DiscountTenProcent();

        /*Gjorde en order klass för uträkningen så man kan återanvända metoderna isället
        * för att skriva uträkningarna i main*/
        Order order = new Order(discount);
        order.addItem(item1);
        order.addItem(item2);

        /*För att skriva ut allt så använde jag mig bara av en metod som printar ut allt
        * i min order klass*/
        order.printSummary();

        //Uppgift 4
        List<IAnimal> animalList = new ArrayList();
        Bird bird = new Bird();
        Dog dog = new Dog();


        animalList.add(bird);
        animalList.add(dog);
        for (IAnimal animal : animalList) {
            animal.eat();

        }






    }

    }



