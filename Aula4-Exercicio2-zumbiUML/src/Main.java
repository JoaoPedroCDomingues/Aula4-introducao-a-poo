import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        int quantia;

        z1.nome = "zumbi da silva";
        z2.nome = "zumbi brito";

        System.out.println("Vida de: " + z1.nome);
        z1.vida = scanner.nextDouble();
        System.out.println("Vida de: " + z2.nome);
        z2.vida = scanner.nextDouble();

        System.out.println("Vida adicional de: " + z1.nome);
        quantia = scanner.nextInt();
        z1.transfereVida(z1, quantia);
        System.out.println("Vida adicional de: " + z2.nome);
        quantia = scanner.nextInt();
        z2.transfereVida(z2, quantia);

        System.out.println("Nome: " + z1.nome);
        System.out.println("Vida final: " + z1.mostraVida());
        System.out.println("Nome: " + z2.nome);
        System.out.println("Vida final: " + z2.mostraVida());
        
        scanner.close();
    }
}