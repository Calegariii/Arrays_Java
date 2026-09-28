public class Questao08 {
    public static void main(String[] args) {
        System.out.println("--- QUESTAO 08 ---");
        Questao08 q = new Questao08();

        int[][] matriz = new int[2][2];
        double media = q.calculaMedia(matriz);
        System.out.println("A media aritmetica dos elementos da matriz eh: " + media);
    }

    public double calculaMedia(int[][] matrix) {
        int count = 0;
        double soma = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Teclado.leInt("Digite um numero inteiro para a matriz: ");
                soma += matrix[i][j];
                count++;
            }
        }
        return soma / count;
    }
}