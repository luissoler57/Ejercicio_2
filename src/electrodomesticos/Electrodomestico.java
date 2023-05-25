package electrodomesticos;

public class Electrodomestico {

    protected String tipo;
    protected String marca;
    protected double potencia;

    /* Constructor con parametros */
    public Electrodomestico(String tipo, String marca, double potencia) {
        this.tipo = tipo;
        this.marca = marca;
        this.potencia = potencia;
    }

    /* GETTERS AND SETTERS */
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    /* Metodo toString */
    @Override
    public String toString() {
        return "Electrodomestico [\ntipo=" + tipo + ",\nmarca=" + marca + ",\npotencia=" + potencia + "\n]";
    }

    /* Metodo getConsumo */
    public double getConsumo(int cantidadHoras) {
        return potencia * cantidadHoras;
    }

    /* Metodo getCosteConsumo */
    public double getCosteConsumo(int horas, double costeHora) {
        return getConsumo(horas) * costeHora;
    }
}
