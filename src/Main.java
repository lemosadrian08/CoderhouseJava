public class Main {
    public static void main(String[] args) {
        float numero = 5.2f;
        double parteDecimal = numero % 1;
        double parteEntera = numero - parteDecimal;
        System.out.println(parteDecimal);
        System.out.println(parteEntera);
    }
}