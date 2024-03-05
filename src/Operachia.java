
public class Operachia {
    public  static int Rezultat() throws Exception {

        int result;
        switch (Calculate.numbers[1]) {
            case "+":
                result = Calculate.a + Calculate.b;
                break;
            case "-":
                result = Calculate.a - Calculate.b;
                break;
            case "/":
                result = Calculate.a / Calculate.b;
                break;
            case "*":
                result = Calculate.a * Calculate.b;
                break;
            default:
                throw new Exception("Введен неверный символ, используйте + - / *");
        }
        return result;
    }
}