import java.util.Scanner;

public class Calculate {


    static String[] numbers;
    static int a;
    static int b;

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите пример:");
        numbers = in.nextLine().split(" ", 3);
        boolean isArab = arabOrNot(numbers[0], numbers[2]);
        if (isArab) {
            a = Integer.parseInt(numbers[0]);
            b = Integer.parseInt(numbers[2]);
            if (a > 10 || b > 10 || a < 1 || b < 1) {
                throw new Exception("Числа принимаемые на вход не более 10, и не менее 1");
            }
            System.out.println("Ответ " + Operachia.Rezultat());
        } else {
            a = Roman.valueOf(numbers[0]).getNum();
            b = Roman.valueOf(numbers[2]).getNum();
            if (a > 10 || a < 1 || b > 10 || b < 1) {
                throw new Exception("Числа принимаемые на вход больше 10 и не меньше 1");
            }
            System.out.println("Ответ " + Roman.convert(Operachia.Rezultat()));
        }
    }






    public static boolean arabOrNot (String st1, String st2){
        try {
            Integer.parseInt(st1);
            Integer.parseInt(st2);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}