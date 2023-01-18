/*
* Тут все качественно по условию создали первый абстрактный класс Figure1
* В конце кого-то из заданий было подписка создайте абстрактный класс для площади, я создал Area и началась резня*/
abstract class Figure1 extends Area{ // Класс площади - родительский класс класса Figure1
    /*
    * Класс фигуре ещё абстракный в гугле почитаешь, что это такое
    * Главный прикол - нельзя создавать его объекты в main и вопрос зачем нам все это делать?
    * А, для того, чтобы потом переопределять методы в других классах*/
    protected double x; // По условию x c модификатором protected

    private String name;

    public void setX(double x) {
        this.x = x;
    }

    public double getX(){
        return x;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    Figure1(String name, double x){
        this.name = name;
        this.x = x;
    }

}
    class Circle extends Figure1{
        /*
        * ТК инфу о кружке надо выводить было принято тактическое решение
        * Создать класс круг с родительским Figure1
        * Типо леголизовали figure1 и создали этот класс, у которого можно создать объект и вывести все нужное*/
        Circle(String name, double x) {
            super(name, x);
        } //Переопределили конструктор родительского класса, чекни что такое абстрактные классы и наследование в java и все будет понятно

        public double Area(double x){
            return super.AreaCircle(x);
        } // Тут уже наследование метода, который считает площадь круга из Area

        public void Info(){
            System.out.println("Площадь = " + Area(x));
            System.out.println("Фигура" + getName());
            System.out.println("Параметр x = " + x);
            System.out.println();
        }

    }
