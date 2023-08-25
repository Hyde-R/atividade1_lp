import java.util.Scanner;

public class Frase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidade_vogal = 0;
        String frase1;

        System.out.println("Digite a uma frase: ");
        frase1 = sc.nextLine();


        for (int i = 0; i < frase1.length(); i++) {
            frase1.charAt(i);
            if (frase1.charAt(i) == 'a' || frase1.charAt(i) == 'e' || frase1.charAt(i) == 'i' ||
                    frase1.charAt(i) == 'o' || frase1.charAt(i) == 'u' ||
            frase1.charAt(i) == 'A' || frase1.charAt(i) == 'E' || frase1.charAt(i) == 'I' ||
                    frase1.charAt(i) == 'O' || frase1.charAt(i) == 'U') {
                quantidade_vogal++;
            }
            else {
            }

        }
        System.out.println("A quantidade de vogais nessa frase é: " + quantidade_vogal);
        sc.close();
    }
}
