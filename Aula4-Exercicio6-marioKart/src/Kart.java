public class Kart {

    public String nome;
    Piloto pil;
    Motor mot;

    public Kart(){
        mot = new Motor();
    }

    public void pular(){
        System.out.println(nome + " Pulando!");
    }

    public void soltarTurbo(){
        System.out.println(nome + " Soltando Turbo!");
    }

    public void fazerDrift(){
        System.out.println(nome + " Fazendo drift!");
    }

}
