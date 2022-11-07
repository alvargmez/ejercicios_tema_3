package segunda_parte;

public class coche {

    private int n_puertas;

    public coche (){

        n_puertas = 3;

    }

    public void add_puerta (int puerta){

        n_puertas = n_puertas + puerta;

    }

    public void quitar_puerta(int puerta){

        n_puertas = n_puertas - puerta;

    }

    //getter
    public int ver_puertas(){

        return n_puertas;

    }

}
