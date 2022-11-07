package segunda_parte;

public class pruerba_ejercicio {

    static void main(String[] args){

        coche seat = new coche();

        System.out.println("Puertas por defecto = " + seat.ver_puertas());

        seat.add_puerta(1);

        System.out.println("añadiendo puerta, Puertas = " + seat.ver_puertas());

        seat.quitar_puerta(1);

        System.out.println("Quitando puerta, Puertas = " + seat.ver_puertas());

    }

}
