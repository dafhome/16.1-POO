public class App {
    public static void main(String[] args) throws Exception {

        Ordenadores ordenador = new Ordenadores("Apple", 16, 256, 4);

        System.out.println("Vamos a mostrar todos los detalles del ordenador:");
        System.out.println();
        System.out.println(ordenador.toString());

        System.out.println();
        System.out.println("Ahora mostraremos marca y RAM");
        System.out.println("Es un "+ordenador.getMarca()+" con "+ordenador.getMemoria()+" Gb de memoria.");

        System.out.println();
        ordenador.setDisco(1000);
        ordenador.setMemoria(32);
        System.out.println("Me había equivocado, rectifico el disco y la memoria del ordenador:");
        System.out.println("El ordenador es un "+ordenador.getMarca()+" con un disco duro SSD de "+ordenador.getDisco()+" Gb, "+ordenador.getProcesadore()+" procesadores y "+ordenador.getMemoria()+" Gb de memoria RAM.");
    }
}
