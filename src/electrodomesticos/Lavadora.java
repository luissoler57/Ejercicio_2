package electrodomesticos;

public class Lavadora extends Electrodomestico {

    private double precio;
    private boolean aguaCaliente;

    /* Constructor que recibe marca y potencia */
    public Lavadora(String marca, double potencia) {
        /* Lamar al constructor de la super clase */
        super("Lavadora", marca, potencia);
        precio = 0;
        aguaCaliente = false;
    }

    /* Constructor con todos los parametros */
    public Lavadora(String marca, double precio, double potencia, boolean aguaCaliente) {
        /* Lamar al constructor de la super clase */
        super("Lavadora", marca, potencia);
        this.precio = precio;
        this.aguaCaliente = aguaCaliente;
    }

    /* Getters and Setters */
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isAguaCaliente() {
        return aguaCaliente;
    }

    public void setAguaCaliente(boolean aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }

    /* Metodo toString */
    @Override
    public String toString() {
        return "Lavadora [\n" +
                "marca= " + marca +
                "\npotencia= " + marca +
                "\nprecio=" + precio +
                "\naguaCaliente=" + aguaCaliente +
                "\n]";
    }

    /* Metodo getConsumo */
    @Override // Se reprograma el metodo de la super clase
    public double getConsumo(int horas) {
        if (aguaCaliente) {
            return (potencia + potencia * 020) * horas;
        } else {
            return potencia * horas;
        }
    }
}
