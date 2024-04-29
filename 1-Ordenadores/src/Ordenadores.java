
public class Ordenadores {

   private String marca;
   private String modelo;
   private int memoriaRAM;
   private int discoDuro;
   private int procesadores;

   public Ordenadores(String marca, String modelo, int memoriaRAM, int discoDuro, int procesadores) {
      this.marca = marca;
      this.modelo = modelo;
      this.memoriaRAM = memoriaRAM;
      this.discoDuro = discoDuro;
      this.procesadores = procesadores;
   }
   // GETTERS
   public String getMarca() {
      return this.marca;
   }

   public String getModelo() {
      return this.modelo;
   }

   public int getMemoria() {
      return this.memoriaRAM;
   }

   public int getDisco() {
      return this.discoDuro;
   }

   public int getProcesadore() {
      return this.procesadores;
   }

   // SETTERS
   public void setMarca(String marca){
      this.marca = marca;
   }

   public void setModelo(String modelo){
      this.modelo = modelo;
   }

   public void setMemoria(int memoriaRAM){
      this.memoriaRAM = memoriaRAM;
   }

   public void setDisco(int discoDuro){
      this.discoDuro = discoDuro;
   }

   public void setProcesadores(int procesadores){
      this.procesadores = procesadores;
   }

   // toString()
   @Override
   public String toString() {
       return "Buena elección, has comprado un ordenador "+getMarca()+" modelo "+getModelo()+" con un disco duro SSD de "+getDisco()+" Gb, "+getProcesadore()+" procesadores y "+getMemoria()+" Gb de memoria RAM.";
   }
}