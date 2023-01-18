abstract class Area { // Абстрактный класс, который счиает площадь для все трех классов figure
    public double AreaCircle(double r){ //Площадь круга
        return Math.PI * Math.pow(r, 2);

    }
    public double AreaTrapeze(double x, double y, double h){ //Площадь трапеции
        return ((x + y) / 2) * h;

    }

    public double AreaFigure2(double x, double y){ // Площадь прямоугольника
        return x * y;
    }
}
