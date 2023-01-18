//Фигуры черная и белая пешка
public abstract class Figure { // Создали абстракный класс
    private char letter; //Буква на которой стоит фигура
    private int number; // Цифра на которой стоит фигура

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public char getLetter() {
        return letter;
    }

    public Figure(char letter, int number) { // конструктор класса
        this.letter = letter;
        this.number = number;
    }

    public void U(int num) { // Направление ходов белой пешки,
        // в зависимости  от числа, которое вернет move будет рассчитанно циклом for колво шагов, которое может сделать фигрура в данным направлении
        for (int i = 0; i < num; i++) {
            System.out.print("U");
        }
        System.out.println();
    }

    public void D(int num) { // Направление ходов черной пешки, определается также, как U только сверху-вниз, а не снизу-вверх
        for (int i = 0; i < num; i++) {
            System.out.print("D");
        }
        System.out.println();
    }

    public void R() {

    }

    public void L () {

    }

    abstract int move(); // Колво ходов, которое может сделать фигура
}
