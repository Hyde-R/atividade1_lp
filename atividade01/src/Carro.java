import java.util.Scanner;

public class Carro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String placa;
        int ano;

        System.out.println("Digite a placa:");
        placa = sc.nextLine();

        System.out.println("Digite o ano do veiculo:");
        ano = sc.nextInt();

        sc.close();

        if(ano < 2010){
            System.out.println("Carro velho!");
        }
        else if(ano < 2022){
            System.out.println("Carro semi novo!");
        }
        else if(ano == 2023){
            System.out.println("Carro novo!");
        }
        else {
            System.out.println("Inválido!");
        }

        for(int i = 0; i < placa.length(); i++){
            if(placa.charAt(i) == 'A' || placa.charAt(i) == 'E' || placa.charAt(i) == 'I' ||
                    placa.charAt(i) == 'O' || placa.charAt(i) == 'U'){
                    placa = placa.replace(placa.charAt(i), '*');
            }
            else{
            }
        }
        System.out.println("Nova placa: " + placa);
    }

}
