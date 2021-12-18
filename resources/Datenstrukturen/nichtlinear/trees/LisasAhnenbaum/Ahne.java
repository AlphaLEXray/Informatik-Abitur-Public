
/**
 * Die Klasse Namen ist der ContentType des BinaryTrees und speichert den Namen des Vorfahrens.
 */
public class   Ahne
{
    private String vorname;
    private String nachname;
    private char geschlecht;

    /**
     * Konstruktor für Objekte der Klasse Namen
     */
    public Ahne(String pVorname, String pNachname, char pgeschlecht)
    {
        vorname = pVorname;
        nachname = pNachname;
        geschlecht = pgeschlecht;
    }

    /*------------------- start set-Methoden--------------*/
    public void setName(String pVorname)
    {
        vorname = pVorname;
    }
    
    public void setNachname(String pNachname)
    {
        nachname = pNachname;
    }
    
    public void setGeschlecht(char pGeschlecht)
    {
        geschlecht = pGeschlecht;
    }
    /*-----------------ende set-Methoden------------------*/
    
    /*-----------------start get-Methoden-----------------*/
    
    public String getVorname()
    {
        return vorname;   
    }
    
    public String getNachname()
    {
        return nachname;
    }
    
    public char getGeschlecht()
    {
        return geschlecht;
    }
    /*-------------ende get-Methoden-----------------------*/
}
