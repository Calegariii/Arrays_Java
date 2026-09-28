import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Classe que permite fazer a leitura de dados do teclado.
 */
public class Teclado {
    private static InputStreamReader i = new InputStreamReader(System.in);
    private static BufferedReader d = new BufferedReader(i);

    public static int leInt(String msg) {
        int a = 0;
        System.out.print(msg);
        try {
            a = Integer.parseInt(d.readLine());
        } catch (IOException e) {
            System.out.println("Erro de I/O");
        } catch (NumberFormatException e) {
            System.out.println("Número inteiro inválido!");
        }
        return a;
    }

    public static double leDouble(String msg) {
        double a = 0;
        System.out.print(msg);
        try {
            a = Double.parseDouble(d.readLine());
        } catch (IOException e) {
            System.out.println("Erro de I/O");
        } catch (NumberFormatException e) {
            System.out.println("Número real inválido!");
        }
        return a;
    }

    public static String leString(String msg) {
        String a = "";
        System.out.print(msg);
        try {
            a = d.readLine();
        } catch (IOException e) {
            System.out.println("Erro de I/O");
        }
        return a;
    }
}