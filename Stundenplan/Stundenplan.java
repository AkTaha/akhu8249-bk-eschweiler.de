import java.util.ArrayList ;

import java.awt.Image.* ;
import java.awt.*;
import javax.swing.* ;



/**
 * Beschreiben Sie hier die Klasse Stundenplan.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Stundenplan
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String klasse;
    private ArrayList<Tag> woche ;
    private Container contentPane;
    private JFrame fenster;
    /**
     * Konstruktor für Objekte der Klasse Stundenplan
     */
    public Stundenplan(String klasse)
    {
        this.klasse = klasse ;
        woche = new ArrayList<Tag>();
        stundenplanAnzeigen();
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public void tagHinzufuegen(Tag tag)
    {
        woche.add(tag);
    }
    
    public void stundenplanAnzeigen()
    {
       fenster = new JFrame("Stundenplan");
        
       contentPane = fenster.getContentPane();
        
       contentPane.setLayout(new GridLayout(6,12));
       conntentPane.add();
    }
}
