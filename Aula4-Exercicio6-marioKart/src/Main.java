import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Piloto p1 = new Piloto();
        Piloto p2 = new Piloto();
        Kart k1 = new Kart();
        Kart k2 = new Kart();
        int x = 0;

        k1.pil = p1;
        k2.pil = p2;

        k1.nome = "kart 1";
        k2.nome = "kart 2";
        System.out.println("Nome do primeiro piloto: ");
        p1.nome = sc.nextLine();
        System.out.println("Nome do segundo piloto: ");
        p2.nome = sc.nextLine();
        System.out.println("O primeiro piloto é um vilão?");
        p1.vilao = sc.nextBoolean();
        sc.nextLine();
        System.out.println("O segundo piloto é um vilão?");
        p2.vilao = sc.nextBoolean();
        sc.nextLine();
        System.out.println("Quantas cilindradas tem o primeiro kart?");
        do{
            k1.mot.cilindradas = sc.nextLine();
        }while (!k1.mot.cilindradas.equals("50") && !k1.mot.cilindradas.equals("100") && !k1.mot.cilindradas.equals("150"));

        System.out.println("Quantas cilindradas tem o segundo kart?");
        do{
            k2.mot.cilindradas = sc.nextLine();
        }while (!k2.mot.cilindradas.equals("50") && !k2.mot.cilindradas.equals("100") && !k2.mot.cilindradas.equals("150"));

        System.out.println("Qual a velocidade máxima do primeiro kart?");
        k1.mot.velocidadeMaxima = sc.nextInt();
        sc.nextLine();
        System.out.println("Qual a velocidade máxima do segundo kart?");
        k2.mot.velocidadeMaxima = sc.nextInt();
        sc.nextLine();

        System.out.println("Chamando funções...");
        System.out.println("Carro 1: ");
        if(p1.vilao){
            System.out.println("É o vilão!");
        }
        else{
            System.out.println("Não é o vilão!");
        }
        p1.soltaSuperPoder();
        k1.pular();
        k1.fazerDrift();
        k1.soltarTurbo();
        k1.mot.mostraInfo();

        System.out.println("Carro 2: ");
        if(p2.vilao){
            System.out.println("É o vilão!");
        }
        else{
            System.out.println("Não é o vilão!");
        }
        p2.soltaSuperPoder();
        k2.pular();
        k2.fazerDrift();
        k2.soltarTurbo();
        k2.mot.mostraInfo();

        sc.close();
    }
}