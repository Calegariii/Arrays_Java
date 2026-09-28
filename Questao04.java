public class Questao04 {
    public static void main(String[] args) {
        System.out.println("--- QUESTAO 04 ---");
        Questao04 q = new Questao04();

        // Item a: Média das notas
        int[] notas = new int[3];
        float media = q.calculaMediaNotas(notas);
        System.out.printf("a) A media das notas eh: %.2f\n", media);

        // Item b: Múltiplos de 3 e 5
        int[] arrayCem = new int[100];
        int qtdMultiplos = q.contarMultiplos3e5(arrayCem);
        System.out.println("b) Quantidade de multiplos comuns de 3 e 5: " + qtdMultiplos);
    }

    public float calculaMediaNotas(int[] vet) {
        int soma = 0;
        int count = 0;
        for (int i = 0; i < vet.length; i++) {
            int nota;
            do {
                nota = Teclado.leInt("Digite uma nota inteira (0 a 10): ");
                if (nota < 0 || nota > 10) {
                    System.out.println("Nota invalida!! Tente novamente.");
                }
            } while (nota < 0 || nota > 10);

            vet[i] = nota;
            soma += vet[i];
            count++;
        }
        return (float) soma / count;
    }

    public int contarMultiplos3e5(int[] vet) {
        int count = 0;
        for (int i = 1; i < vet.length; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                vet[count] = i;
                System.out.println("Multiplo de 3 e 5 encontrado: " + i);
                count++;
            }
        }
        return count;
    }
}