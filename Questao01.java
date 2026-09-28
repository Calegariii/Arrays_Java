public class Questao01 {
    public static void main(String[] args) {
        int[] a = {507, -15, 147, 2194, 300, 27, 888, -110, 0, 675};

        System.out.println("--- QUESTAO 01 ---");
        System.out.println("a) Indice do 3º elemento: 2");
        System.out.println("b) Conteudo do 3º elemento: " + a[2]);
        System.out.println("c) Indice do 1º elemento: 0");
        System.out.println("d) Conteudo do 1º elemento: " + a[0]);
        System.out.println("e) Indice do valor 888: 6");
        System.out.println("f) Valor de a[5]: " + a[5]);
        System.out.println("g) Valor de a[5] + 2: " + (a[5] + 2));
        System.out.println("h) Valor de a[5 + 2]: " + a[5 + 2]);

        int x = 2;
        int y = 4;
        System.out.println("i) Valor de a[x] + a[y] + 1: " + (a[x] + a[y] + 1));
        System.out.println("j) Valor de a[x + y + 1]: " + a[x + y + 1]);
        System.out.println("k) Valor de a.length: " + a.length);
        System.out.println("l) Valor de a[a.length - 1]: " + a[a.length - 1]);
    }
}