
class Figure3 extends Figure2{ // Все как в figure1 и figure2

    private double h;
    public Figure3(String name, double x, double y, double h) {
        super(name, x, y);
        this.h = h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getH() {
        return h;
    }


}
    class Trapezee extends Figure3{

        public Trapezee(String name, double x, double y, double h) {
            super(name, x, y, h);
        }

        public double Area(double x, double y, double h){
            return super.AreaTrapeze(x, y, h);
        }

        public void Info(){
            System.out.println("Площадь = " + Area(x, getY(), getH()));
            System.out.println("Фигура " + getName());
            System.out.println("Параметр x = " + x);
            System.out.println("Параметр у = " +  getY());
            System.out.println("Параметр h = " + getH());
            System.out.println();
        }
    }
