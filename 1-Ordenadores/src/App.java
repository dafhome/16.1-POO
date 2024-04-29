import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Ordenadores ordenador = new Ordenadores("Apple","Macbook Pro", 16, 256, 4);

        System.out.println("Vamos a mostrar todos los detalles del ordenador:");
        System.out.println();
        System.out.println(ordenador.toString());

        System.out.println();
        System.out.println("Ahora mostraremos marca y RAM");
        System.out.println("Es un "+ordenador.getMarca()+" con "+ordenador.getMemoria()+" Gb de memoria RAM.");

        ordenador.setDisco(1000);
        ordenador.setMemoria(32);
        System.out.println("Me había equivocado, rectifico el disco y la memoria del ordenador:");
        System.out.println("El ordenador es un "+ordenador.getMarca()+" modelo "+ordenador.getModelo()+" con un disco duro SSD de "+ordenador.getDisco()+" Gb, "+ordenador.getProcesadore()+" procesadores y "+ordenador.getMemoria()+" Gb de memoria RAM.");

        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Ahora indicame un nuevo ordenador, te preguntaré las características:");
        Ordenadores ordenador2 = new Ordenadores(null,null, 0, 0, 0);
        System.out.print("Indicame la marca: ");
        ordenador2.setMarca(scan.nextLine());
        System.out.print("Indicame el modelo: ");
        ordenador2.setModelo(scan.nextLine());
        System.out.print("Indicame los Gb de disco duro: ");
        ordenador2.setDisco(scan.nextInt());
        System.out.print("Indicame la memoria RAM en Gb: ");
        ordenador2.setMemoria(scan.nextInt());
        System.out.print("Ahora dime cuantos procesadores tiene: ");
        ordenador2.setProcesadores(scan.nextInt());


        System.out.println("El nuevo ordenador es un "+ordenador2.getMarca()+" modelo "+ordenador2.getModelo() +" con un disco duro SSD de "+ordenador2.getDisco()+" Gb, "+ordenador2.getProcesadore()+" procesadores y "+ordenador2.getMemoria()+" Gb de memoria RAM.");

        System.out.println();

        Imprimir print = new Imprimir(null, 1, 1);
        print.setFrase("El nuevo ordenador es un "+ordenador2.getMarca()+" modelo "+ordenador2.getModelo() +" con un disco duro SSD de "+ordenador2.getDisco()+" Gb, "+ordenador2.getProcesadore()+" procesadores y "+ordenador2.getMemoria()+" Gb de memoria RAM.");
        print.printLentamente();


        print.setEnter(0);
        print.setFrase("El nuevo ordenador es un ");
        print.printLentamente();
        print.setFrase(ordenador2.getMarca());
        print.printLentamente();
        print.setFrase(" modelo ");
        print.printLentamente();
        print.setFrase(ordenador2.getMarca());
        print.printLentamente();
        print.setFrase(" con disco SSD de");
        print.printLentamente();
        print.setEnter(1);
        print.setFrase(" "+ordenador2.getDisco()+".");
        print.printLentamente();

    }
}
