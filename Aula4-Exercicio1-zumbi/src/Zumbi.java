public class Zumbi {

    public String nome;
    public int fome;
    public int vida;

    void mostraNome(){
        System.out.println("Nome: " + this.nome);
    }

    void mostraVida(){
        System.out.println("Vida: " + this.vida);

        if(vida <= 0){
            System.out.println("Seu zumbi morreu!");
        }
    }

    void mostraFome(int fome){
        if(fome >= 50){
            System.out.println("A fome está controlada, vida mantida");
        }
        else{
            System.out.println("A fome está alta, seu zumbi perdeu 10 de vida");
            this.vida -= 10;
            mostraVida();
        }
    }
}
