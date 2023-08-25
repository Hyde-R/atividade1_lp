import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double velocidade, tempo, distancia, kmLitro, consumo;

        System.out.println("Qual a velocidade em km/h do seu veiculo?");
        velocidade = sc.nextDouble();

        System.out.println("Quantas horas duraram a viagem?");
        tempo = sc.nextDouble();

        System.out.println("Quantos kilometros foram gastos por litro?");
        kmLitro = sc.nextDouble();

        distancia = velocidade * tempo;

        consumo = distancia / kmLitro;

        System.out.println("O consumo final foi: " + String.format("%.2f", consumo));
        sc.close();
        }
}