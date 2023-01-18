public class WhitePawn extends Figure{ // Класс Белой пешки производный от фигуры
    public WhitePawn(char letter, int number) { // Конструктор, который наследуется от родительского класса
        super(letter, number);
    }
    @Override // Погугли что такео аннотация override
    int move(){ // Считает сколько шагов может сделать пешка и возвращает их значение
        // Переопределяет метод move и родительского класса
        int number = getNumber(); // Чтобы получить введенное в конструкторе значение цифры где стоит фигура используем геттер
        if ((number > 0) && (number <= 8)){
            if (number == 2){
                return 2;
            } else {
                return 1;
            }
        } else return 0;
    }

    public void U() { //Переопределение метод U
        super.U(move());
    }
}
