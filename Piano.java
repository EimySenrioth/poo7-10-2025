class Piano extends Instrumento {
    public Piano(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public void tocar() {
        System.out.println(Nombre + " está siendo tocado.");
    }

    @Override
    public void afinar() {
        System.out.println(Nombre + " está siendo afinado.");
    }
}