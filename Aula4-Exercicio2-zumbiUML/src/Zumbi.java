public class Zumbi {

    public String nome;
    public double vida;

    double mostraVida(){
        return this.vida;
    }

    void transfereVida(Zumbi zumbiAlvo, double quantia){

        if((quantia + this.vida) <= 0){
            System.out.println("Impossivel modificar vida");
        }
        else{
            this.vida += quantia;
        }
    }
}
