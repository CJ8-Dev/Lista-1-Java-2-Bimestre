public class Exercicio2 {
    public static void main(String[] args) {
        System.out.println(" Exercício 2 ");
        double[] precos = new double[3];
        precos[0] = 12.90;
        precos[1] = 5.50;
        precos[2] = 30.00;
        for (int i = 0; i < precos.length; i++) {
            System.out.printf("Produto %d: R$ %.2f%n", (i + 1), precos[i]);
        }
    }
}
