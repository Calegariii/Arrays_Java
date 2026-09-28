public class Questao05 {
    public static void main(String[] args) {
        int[][] mat = {
            {13, 45, 12, 19},
            {67, -5, 88, 37},
            {11, 43, 13, 0},
            {64, 52, 29, 18},
            {71, 14, 19, 62}
        };

        System.out.println("--- QUESTAO 05 ---");
        System.out.println("a) Quantidade de linhas: " + mat.length);
        System.out.println("b) Quantidade de colunas: " + mat[0].length);
        System.out.println("c) Elemento 19 nas posicoes: mat[0][3] e mat[4][2]");
        System.out.println("d) Valor de mat[1][1]: " + mat[1][1]);
        System.out.println("e) Valor de mat[2][0] + 1: " + (mat[2][0] + 1));
        System.out.println("f) Valor de mat[3+1][3-1]: " + mat[3 + 1][3 - 1]);

        int x = 2;
        System.out.println("g) Valor de mat[x][x]: " + mat[x][x]);
        System.out.println("h) Valor de mat[x+1][x]: " + mat[x + 1][x]);
        System.out.println("i) Valor de mat[x][x] + 1: " + (mat[x][x] + 1));
        System.out.println("j) Valor de mat.length: " + mat.length);
        System.out.println("k) Valor de mat[mat.length-1][1]: " + mat[mat.length - 1][1]);
        System.out.println("l) Total de numeros armazenados: " + (mat.length * mat[0].length));
    }
}