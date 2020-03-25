
/**
 * Beschreiben Sie hier die Klasse Stunde.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Stunde
{
        // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
        private String fach;
        private int stunde;
        private int raum;
        private String lehrer;
    
        /**
         * Konstruktor für Objekte der Klasse Stunde
         */
        public Stunde(String fach,int stunde,int raum ,String lehrer)
        {
            this.fach = fach ;
            this.stunde = stunde ;
            this.raum = raum ;
            this.lehrer = lehrer ;
        }

    
        //Sondierende Methoden
        public String gibFach()
        {
            // tragen Sie hier den Code ein
            return fach;
        }
        
        public int gibStunde()
        {
            // tragen Sie hier den Code ein
            return stunde;
        }
        
        public int gibRaum()
        {
            // tragen Sie hier den Code ein
            return raum;
        }
        
        public String gibLehrer()
        {
            // tragen Sie hier den Code ein
            return lehrer;
        }
        
        //Ändernde Methoden
        
        public void aenderFach(String fach)
        {
            this.fach = fach ;
        }
        
        public void aenderStunde(int stunde)
        {
            this.stunde = stunde ;
        }
        
        public void aenderRaum(int raum)
        {
            this.raum = raum ;
        }
        
        public void aenderLehrer(String lehrer)
        {
            this.lehrer = lehrer ;
        }
}
