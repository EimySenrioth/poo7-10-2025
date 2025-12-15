abstract class Instrumento {
    protected String Nombre;
    protected String tipo;
    
    // Constructor por defecto
    public Instrumento() {
        this.Nombre = "Sin nombre";
        this.tipo = "Genérico";
    }
    
    // Constructor sobrecargado
    public Instrumento(String nombre, String tipo) {
        this.Nombre = nombre;
        this.tipo = tipo;
    }
    
    public abstract void tocar();
    public abstract void afinar();
    
    public String getNombre() {
        return Nombre;
    }
    
    public String getTipo() {
        return tipo;
    }
}