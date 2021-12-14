
/**
 * Beschreibung der Liste
 * 
 * @author 
 
 */
public class Liste {
    /** Verwaltung des ersten Knoten in der Liste. */
    Listenelement anfang;
    
     /**
     * Konstruktor der Liste
     * 
     */
    public Liste() {
        // Todo a) 
        anfang = null;
    }
    
    /**
     * Bestimmt die Laenge der Liste
     */
    public int laengeGeben(){
       return anfang.restlaengeGeben();
    }
    
    /**
     * Gibt Information der gesamte Liste aus.
     */
    public void alleInformationenAusgeben(){
      // Todo b)
      
    }
    
     /**
     * Fügt ein neues Objekt am Ende der Liste ein.
     */
    public void hintenEinfuegen(Datenelement dNeu) {
        // Todo d)
    }
    
    /**
     * Entfernt das letzte Objekt aus der Liste und gibt es aus.
     * @return bisheriges letztes Objekt 
     */
    public Datenelement endeEntfernen(){
        // Todo e)
        return null;
    }
    
    public void anfangEntfernen() {
        // Todo Zusatzübung (Optional)
    }
}

