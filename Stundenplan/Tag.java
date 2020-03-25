import java.util.ArrayList ;
/**
 * Beschreiben Sie hier die Klasse Tag.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Tag
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String wochentag;
    private ArrayList<Stunde> stunden ;
    /**
     * Konstruktor für Objekte der Klasse Tag
     */
    public Tag(String wochentag)
    {
        this.wochentag = wochentag ;
        stunden = new ArrayList<Stunde>();
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public String gibWochentag()
    {
        return wochentag ;
    }
    
    public void stundeHinzufuegen(Stunde stunde)
    {
        stunden.add(stunde);
    }
    
    public ArrayList gibStunden()
    {
        return stunden ;
    }
}
