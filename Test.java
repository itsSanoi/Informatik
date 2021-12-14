
public class Test {
  public static void main(String[] args){
      Patient p1 = new Patient("Arber");
      Patient p2 = new Patient("Berber");
      Patient p3 = new Patient("Carbon");
      Patient p4 = new Patient("Dieda");
      Patient p5 = new Patient("Erbe");
      Patient p6 = new Patient("Faerber");
      Patient p7 = new Patient("Garbo");
      Patient p8 = new Patient("Harper");
      
      Liste li = new Liste();
      // Test der Methode "laengeGeben"
      System.out.println("Laenge = " + li.laengeGeben());
      
      // Test der Methoden "alleInformationenAusgeben"
      //li.alleInformationenAusgeben();
      
      // Test der Methode hintenEinfuegen
      /*li.hintenEinfuegen(p1);
      li.hintenEinfuegen(p2);
      li.hintenEinfuegen(p3);
      li.hintenEinfuegen(p4);
      li.hintenEinfuegen(p5);
      li.hintenEinfuegen(p6);
      li.hintenEinfuegen(p7);
      li.alleInformationenAusgeben();
      System.out.println("Laenge = "+li.laengeGeben());*/
      
      // Test der Methode "endeEntfernen()"
      /*li.endeEntfernen();
      li.alleInformationenAusgeben();
      System.out.println("Laenge = "+li.laengeGeben());*/
      
      // Test der Methode "anfangEntfernen()"
      /*li.anfangEntfernen();
      li.alleInformationenAusgeben();
      System.out.println("Laenge = "+li.laengeGeben());*/
    }
}
      
      
      
      
      

