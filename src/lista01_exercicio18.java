import java.util.Scanner;

public class lista01_exercicio18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o tamanho do arquivo em MB: ");
        double tamanhoArquivo = input.nextDouble();
        
        System.out.print("Digite a velocidade do dowload de Internet em Mbps: ");
        double velocidadeInternet = input.nextDouble();
        double velocidadeDownload = velocidadeInternet / 8;
        double tempoDownload = (tamanhoArquivo / velocidadeDownload) / 60;
        
        System.out.printf("O tempo aproximado de download do arquivo é de %.2f minutos.", tempoDownload);
        
        input.close();
    }
}
