import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Escada {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder escada = new StringBuilder();

        System.out.println("Bem vindo ao construtor de escadas" +
                "" +
                "Insira o número de degraus para sua escada:");

        int totalDeDegraus = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < totalDeDegraus; i++) {
            escada.append(" ");

        }

        for (int i = 1; i < totalDeDegraus + 1; i++) {
            escada.setCharAt(totalDeDegraus - i, '*');
            System.out.println(escada);
        }
    }
}