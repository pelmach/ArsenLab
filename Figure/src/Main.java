/*
* Короче, ООП полным ходом
* Творится лютая резня
* */
public class Main {
    public static void main(String[] args) {
        String name1 = "Круг"; // В лабе писал, что там в конструкторе класса предусмотреть автоматическое задание названия фигуры
        // Я забил на то, что там написано и просто создал переменные, так удобнее и меньше возни
        String name2 = "Трапеция";

        //по 2 объекта каждого класса, какие фигуры были в первом задание и вывод всей инфы по ним
        Circle circle1 = new Circle(name1, 2.1);
        circle1.Info();

        Circle circle2 = new Circle(name1, 5.6);
        circle2.Info();

        Trapezee trapezee1 = new Trapezee(name2, 2, 5, 7);
        trapezee1.Info();

        Trapezee trapezee2 = new Trapezee(name2, 1.2, 4.6, 7.7);
        trapezee2.Info();
    }
}