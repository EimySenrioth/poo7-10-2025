class Guitarra extends Instrumento {
    public Guitarra(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public void tocar() {
        System.out.println(Nombre + " está siendo tocada.");
    }

    @Override
    public void afinar() {
        System.out.println(Nombre + " está siendo afinada.");
    }
}