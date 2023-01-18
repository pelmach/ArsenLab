
abstract class Figure2 extends Figure1 { //Аналогичнаяч ситуация, что и с figure1, только тут есть парочка приколов
    private double y;

    public Figure2(String name, double x, double y){ //Конструктор класса использует конструктор родительского класса + добавляет то, что надо для этого класса
        super(name, x);
        this.y = y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY(){
        return  y;
    }
}
    class Cube extends Figure2{ // Тотже прикол, что с классом Circle, только этот по факту бесполезный и не будет использоваться
        public Cube(String name, double x, double y) {
            super(name, x, y);
        }
        public double Area(double x, double y){
            return super.AreaFigure2(x, y);
        }

        public void Info(){
            System.out.println("Площадь = " + Area(x, getY()));
            System.out.println("Фигура " + getName());
            System.out.println("Параметр x = " + x);
            System.out.println("Параметр у = " +  getY());
            System.out.println();
        }
    }
