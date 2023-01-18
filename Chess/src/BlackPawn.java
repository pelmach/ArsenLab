public class BlackPawn extends Figure{ // Класс черной пешки производной от фигуры

    public BlackPawn (char letter, int number) { // Конструктор, который наследуется от родительского класса
        super(letter, number);
    }
    @Override
    int move() { // Считает сколько шагов может сделать пешка и возвращает их значение
        // Переопределяет метод move и родительского класса
        int number = getNumber();
        if ((number > 0) && (number <= 8)){
            if (number == 7){
                return 2;
            } else {
                return 1;
            }
        } else return 0;
    }

    public void D(){ // Переопределение метод D
        super.D(move());
    }
}
