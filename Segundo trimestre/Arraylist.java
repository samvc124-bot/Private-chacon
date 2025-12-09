public class Arraylist
    public static void main(String[] args){


    ArrayList <String> nombres = new ArrayList<String>();
    nombres.add("Ann");
    nombres.add("Cindy");
    System.out.println(nombres); //Se usa toString()
    nombres.add(1,"Bob");
    nombres.remove(0);
    nombres.set(0, "Bill");
    String primero = nombres.get(0);
    String ultimo = nombres.get(nombres.size() - 1);
    System.out.println("Primero: "+primero);
    System.out.println("Ultimo: "+ultimo);
}