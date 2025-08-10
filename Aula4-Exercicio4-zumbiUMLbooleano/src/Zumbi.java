public class Zumbi {

    public String nome;
    public double vida;

    double mostraVida(){
        return vida;
    }

    boolean transfereVida(Zumbi zumbiAlvo, double quantia){

        if((quantia + vida) <= 0){
            return false;
        }
        else{
            this.vida += quantia;
            return true;
        }
    }
}
