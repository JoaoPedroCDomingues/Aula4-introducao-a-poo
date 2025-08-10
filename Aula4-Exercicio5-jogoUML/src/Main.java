import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Personagem personagem = new Personagem();
        Arma arma = new Arma();
        int a;

        System.out.println("Qual o nome do personagem?");
        personagem.nome = sc.nextLine();
        System.out.println("Quanta vida tem o personagem?");
        personagem.pontos = sc.nextInt();
        sc.nextLine();
        System.out.println("Qual o nome da arma?");
        arma.nome = sc.nextLine();
        System.out.println("Qual o poder da arma?");
        arma.poder = sc.nextInt();
        sc.nextLine();
        System.out.println("Qual a resistencia da arma?");
        arma.resistencia = sc.nextInt();
        sc.nextLine();
        System.out.println("Qual a descricao da arma?");
        arma.descricao = sc.nextLine();

        personagem.arma = arma;

        do{

            System.out.println("Escolha uma ação:");
            System.out.println("1 - Atacar");
            System.out.println("2 - Ser atacado");
            System.out.println("3 - Mostrar informações da arma");
            System.out.println("0 - Sair");
            a = sc.nextInt();
            switch(a){
                case 0:
                    System.out.println("Finalizando...");
                break;
                case 1:
                    personagem.usarArma();
                break;
                case 2:
                    personagem.tomarDano();
                break;
                case 3:
                    arma.mostraInfoArma();
                break;
                default:
                    System.out.println("Opção inválida!");
            }

            if(personagem.pontos <= 0){
                break;
            }

        }while (a != 0);

        sc.close();
    }
}