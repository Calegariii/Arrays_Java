public class Questao03 {
    public static void main(String[] args) {
        System.out.println("--- QUESTAO 03 ---");

        // Item a: Armazenar impares no vetor v a partir de 1
        int[] v = new int[10];
        int impar = 1;
        for (int i = 0; i < v.length; i++) {
            v[i] = impar;
            impar += 2;
        }
        System.out.println("a) Vetor de impares preenchido com sucesso.");

        // Item b: Ler e validar notas usando Teclado
        Questao03 q = new Questao03();
        double[] notas = new double[3];
        double media = q.digitaNota(notas);
        System.out.println("b) A media das notas validas eh: " + media);
    }

    public double digitaNota(double[] vet) {
        double soma = 0;
        int count = 0;
        for (int i = 0; i < vet.length; i++) {
            double nota;
            do {
                nota = Teclado.leDouble("Digite uma nota (0.0 a 10.0): ");
                if (nota < 0.0 || nota > 10.0) {
                    System.out.println("Nota invalida!! Tente novamente.");
                }
            } while (nota < 0.0 || nota > 10.0);

            vet[i] = nota;
            soma += vet[i];
            count++;
        }
        return soma / count;
    }
}