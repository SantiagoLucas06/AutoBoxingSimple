public class Operadores {

    public static void main(String args[]) {
        operacoesLogicas();
    }

    private static void operacoesLogicas() {
        System.out.println("operacoesLogicas");

        int num1 = 10;
        int num2 = 10;

        boolean respondaDentro10 = num1 >= 1 && num1 <=10;
        System.out.println("respondaDentro10: " + respondaDentro10);
    }
}
