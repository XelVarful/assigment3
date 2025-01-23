public class Hedgehog {
    public void eat(Apple apple) {
        System.out.println("Яблоко было съедено!");
    }

    public static void main(String[] args) {
        // Создаем объект Apple
        Apple apple = new Apple();

        // Создаем объект Hedgehog
        Hedgehog hedgehog = new Hedgehog();

        // Ежик ест яблоко
        hedgehog.eat(apple);
    }

    public static class Apple {
    }
}