package com.mycompany;

public class Main {

    static class Parent {
        void test() {
            System.out.println("parent::test()");
        }

        void testParent() {
            System.out.println("parent::testParent()");
        }
    }

    static class Child extends Parent {
        @Override
        void test() {
            System.out.println("child::test()");
        }

        void testChild() {
            System.out.println("child::testChild()");
        }
    }

    static void use(Parent item) {
        System.out.println("use:parent");
        item.test();
    }

    static void use(Child item) {
        System.out.println("use:child");
        item.test();
    }

    public static void main(String[] args) {

//        **********Статика**********
//        Account account1 = new Account("Man1");
//        Account account2 = new Account("Man2");
//        Account account3 = new Account("Man3");
//
//        System.out.println(account1.toString());
//        System.out.println(account2.toString());
//        System.out.println(account3.toString());

/**
 * **********Полиморфизм**********
 * Если доч класс приведен к родительскому, то доступны только методы родительского класса
 */
//        Parent item1 = new Child();
//        System.out.println("===Parent -> Child===");
//        item1.test();
//        item1.testParent();
//        item1.testChild(); не достучаться т.к. объект типа Parent

//        System.out.println("===Pather -> Children===");
//        Pather item2 = new Children();
//        item2.test();
//        item2.testPather();

//        System.out.println("===Children -> Children===");
//        Children item3 = new Children();
//        item3.test();
//        item3.testChildren();

//        System.out.println("===Collection===");
//        List<Pather> list = new ArrayList<>();
//        list.add(new Pather());
//        list.add(new Children());
//
//        list.get(0).test();
//        list.get(0).testPather();
//        list.get(1).test();
//        list.get(1).testPather();

//        System.out.println("===Static / Overloading / Раннее связывание / Compile time===");
//        Parent item = new Child();
//        use(item);

//        **********Интерфейсы**********
//        Pentagon pentagon = new Pentagon();
//        Canvas canvas = new Canvas();
//        USSR ussr = new USSR();
//
//        Button redButton = new Button();
//        redButton.add(pentagon);
//        redButton.add(canvas);
//        redButton.add(ussr);
//
//        redButton.click();


    }
}
