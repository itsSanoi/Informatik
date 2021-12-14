public class Patient  implements Datenelement
{
    /** Name des Patienten */
  // Attribute
    private String name;
    
    /**
    * Konstruktor des Patienten
    * @param s Name des Patienten
    */
    public Patient(String s)
    {
        name = s;
    }
  // Anfang Methoden
    public String getName(){
      return name;
    }

    public void informationAusgeben(){
        System.out.print(name +"  ");
    }
    
    public boolean istKleinerAls(Datenelement d){
        Patient p = (Patient)d;
        return (name.compareTo(p.getName())<0);
    }
    
    public boolean schluesselIstGleich(String s){
        return name.equals(s);
    }
  // Ende Methoden
}