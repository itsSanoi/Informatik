
/**
 * Abstract class Listenelement - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Listenelement{
// Anfang Methoden
  
  public abstract Listenelement getNachfolger();
    
  public abstract Datenelement getInhalt();
  
  public abstract void informationAusgeben();
  
  public abstract Knoten hintenEinfuegen(Datenelement dNeu);
  
  abstract Listenelement endeEntfernen(Datenelement d);
  
  public abstract Datenelement getEnde(Datenelement d);
  
  public abstract int restlaengeGeben();
  // Ende Methoden
    
}
