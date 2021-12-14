

public class Knoten extends Listenelement {

  // Anfang Attribute
  private Listenelement nachfolger;
  private Datenelement inhalt;
  // Ende Attribute

  public Knoten(Datenelement d) {
     inhalt = d;
     nachfolger = null;
  }
  
  public Knoten(Datenelement d, Listenelement k) {
     inhalt = d;
     nachfolger = k;
  }

  // Anfang Methoden
  
    /**
   * Gibt die Anzahl der Knoten hinter dem Knoten
   * einschließlich des aktuellen Knotens
   */
  public int restlaengeGeben(){
      return nachfolger.restlaengeGeben() + 1;
  }
  
  public void informationAusgeben(){
     // Todo b)  
  }
  
      
  public Listenelement getNachfolger(){
    // Todo c)
    return null;
  }
  
  /**
   * Einfügen am Ende der Liste
   */
  public Knoten hintenEinfuegen(Datenelement dNeu){
      // Todo d)
      return null;
  }
  
  /**
   * Gibt den Inhalt des letzten Knotens 
   */
  public Datenelement getEnde(Datenelement d){
      // Todo e)
      return null;
  }
  
  public Listenelement endeEntfernen(Datenelement d){
      // Todo f)
      return null;
  }
  
  public Datenelement getInhalt(){
    return inhalt;
  }

  // Ende Methoden
}
