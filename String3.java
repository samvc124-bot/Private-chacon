public class String3 {
    public static void main(String[]args) {
        String cadenainv = "Hola Mundo";
      int j=0;
      char [] revertido=new char[cadenainv.length()];
      for (int i=cadenainv.length()-1;i>=0;i--){
          revertido[j] =cadenainv.charAt(i);
          j++;

            }
      System.out.print("Texto original: " + cadenainv + "   Texto revertido: " + String.valueOf(revertido));
        }
    }

