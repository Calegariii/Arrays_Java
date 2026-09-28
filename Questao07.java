public class Questao07 {
    public static void main(String[] args) {
        System.out.println("--- QUESTAO 07 ---");

        int[][] matriz1 = new int[5][5];
        int qtdImpares = impares(matriz1);
        System.out.println("a) Qtd de impares inseridos na matriz: " + qtdImpares);

        int[][] matriz2 = new int[4][4];
        int qtdAleatorios = numAleatorios(matriz2);
        System.out.println("b) Qtd de numeros aleatorios gerados: " + qtdAleatorios);
    }

    public static int impares(int[][] matrix) {
        int count = 0;
        int x = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = x;
                System.out.println("Impar: " + matrix[i][j]);
                x += 2;
                count++;
            }
        }
        return count;
    }

    public static int numAleatorios(int[][] matrix) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 10 + (int)(Math.random() * 41);
                System.out.println("Aleatorio: " + matrix[i][j]);
                count++;
            }
        }
        return count;
    }
}