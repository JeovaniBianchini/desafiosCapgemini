import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class Anagrama {

    public static void main(String[] args) {

        System.out.println("Digite uma palavra, para saber a quantidade de anagramas possiveis");
        Scanner scanner = new Scanner(System.in);
        String palavra = scanner.next();
        HashMap<String, Integer> substrings = new HashMap<String, Integer>();

        for (int i = 0; i < palavra.length(); i++) {
            for (int j = i + 1; j < palavra.length() + 1; j++) {
                String substring = palavra.substring(i, j);
                char[] charsArray = substring.toCharArray();
                Arrays.sort(charsArray);
                String sortedSubstring = new String(charsArray);

                if (substrings.get(sortedSubstring) == null) {
                    substrings.put(sortedSubstring, 1);
                } else {
                    substrings.put(sortedSubstring, substrings.get(sortedSubstring) + 1);
                }
            }
        }

        Collection<Integer> quantidadesAnagramas = substrings.values();

        int quantidadeTotal = 0;

        for (int quantidade : quantidadesAnagramas) {
            quantidadeTotal += (quantidade * (quantidade - 1)) / 2;
        }

        System.out.println(quantidadeTotal);
    }
}
