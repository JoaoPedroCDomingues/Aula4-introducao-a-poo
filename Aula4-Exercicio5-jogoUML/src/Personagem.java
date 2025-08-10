public class Personagem {

    public String nome;
    public int pontos;
    Arma arma;

    void usarArma(){

        arma.resistencia -= 2;

        if(arma.resistencia >= 0){
            System.out.println("Arma utilizada, sua resistência agora é: " + arma.resistencia);
        }
        else{
            System.out.println("Arma quebrada! Impossível usá-la");
        }
    }

    void tomarDano(){

        pontos -= 5;

        if(pontos > 0){
            System.out.println("Dano recebido! Sua vida agora é: " + pontos);
        }
        else{
            System.out.println("Você morreu!");
        }
    }

}
