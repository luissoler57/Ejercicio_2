import electrodomesticos.Electrodomestico;
import electrodomesticos.Lavadora;

public class App {
    public static void main(String[] args) throws Exception {
        Electrodomestico electrodomestico = new Electrodomestico("nevera", "Electro", 0.2);

        System.out.println(electrodomestico);

        int horas = 10;
        double precioKwh = 4.5;
        /* Consumo por horas */
        double consumo = electrodomestico.getConsumo(10);
        System.out.println("Ha consumido: " + consumo + " Kw");

        System.out.println("------------------------------------------------------------------");
        /* Coste por hora */
        double coste = electrodomestico.getCosteConsumo(horas, precioKwh);
        System.out.println("Debe pagar: " + coste);

        /* LAVADORA */
        System.out.println("---------------------------Lavadora------------------------");
        Lavadora lavadora = new Lavadora("Electrolux", 400, 0.5, false);
        lavadora.setAguaCaliente(true);
        System.out.println(lavadora);

        System.out.println("Consumo de la lavadora en 10 horas es: " + lavadora.getConsumo(horas));

        System.out.println("Coste del consumo en 10 horas: " + lavadora.getCosteConsumo(horas, precioKwh));
    }

}
