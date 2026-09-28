public class Questao02 {
    public static void main(String[] args) {
        System.out.println("--- QUESTAO 02 ---");

        int[] vet;
        System.out.println("a) Array 'vet' declarado.");
        System.out.println("b) Valor na memoria apos declaracao: null.");

        vet = new int[15];
        System.out.println("c) Array instanciado com tamanho 15.");
        System.out.println("d) Valor em vet[5]: " + vet[5]);

        int tam = vet.length;
        System.out.println("e) Valor de tam (vet.length): " + tam);
        System.out.println("f) Ultimo elemento (vet[14]): " + vet[14]);
        System.out.println("g) Indice do primeiro elemento: 0");

        double[] medias = new double[20];
        System.out.println("h) Array 'medias' criado com tamanho: " + medias.length);
    }
}