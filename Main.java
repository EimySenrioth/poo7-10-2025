public class Main {
    public static void main(String[] args) {
        Guitarra guitarra1 = new Guitarra("Guitarra1");
        Guitarra guitarra2 = new Guitarra("Guitarra2");
        Piano piano1 = new Piano("Piano1");
        Piano piano2 = new Piano("Piano2");

        guitarra1.tocar();
        guitarra2.tocar();
        piano1.tocar();
        piano2.tocar();
    }
}

