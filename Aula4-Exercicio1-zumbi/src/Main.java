import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Zumbi z = new Zumbi();

        System.out.println("Qual o nome do zumbi?");
        z.nome = scanner.nextLine();
        System.out.println("Quanta vida o zumbi tem?");
        z.vida = scanner.nextInt();
        System.out.println("Qual o nivel de fome de zumbi?");
        z.fome = scanner.nextInt();

        z.mostraNome();
        z.mostraVida();
        z.mostraFome(z.fome);

        scanner.close();
    }
}