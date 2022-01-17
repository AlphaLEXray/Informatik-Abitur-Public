/**
 * Beschreiben Sie hier die Klasse SortierAlgorythmen.
 */
public class SortierAlgorythmen
{
    //Initialisieren eines leeren Integerarrays mit dem Namen zahlen als Attribut/Globalvariabel
    int[] zahlen; 
    /**
     * Konstruktor für Objekte der Klasse SortierAlgorythmen
     */
    public SortierAlgorythmen()
    {
        //Das Array bekommt Werte zugewiesen
        zahlen = new int[]{24, 45, 106, 2, 321, 486, 3, 2345, 5543, 4456, 455};
    }

    /**
     * Diese Methode führt den Bubblesortalgorithmus auf dem Array zahlen aus
     */
    public void bubbleSort()
    {
        //Die Variabel n gleich die Länge des Arrays zahlen setzen
        int n = zahlen.length;
        //Temporäre Variabel namens temp erstellen um Integers zwischenzuspeichern
        int temp;
        //Solange die Länge des Arrays größer als 1 ist
        while (n > 1){
            //Für n - 1 
            for(int i=0; i<n-1; i++){
                //Überprüft ob der Wert der aktuellen Stelle größer ist als der nächste Wert
                if (zahlen[i] > zahlen[i +1])
                {
                    //Ist dies der Fall werden diese beiden Getauscht
                    //Die aktuelle Zahl (also die größere Zahl) wird in der Variabel temp zwischengespeichert
                    temp = zahlen[i];
                    //Die aktuelle Zahl im Array wird gleich der nächsten Stelle des Arrays gesetzt (also der kleinereren Zahl)
                    zahlen[i] = zahlen[i+1];
                    //Die nächste Zahl wird der Variabel temp gesetzt in der die größere Zahl gespeichert wurde
                    zahlen[i+1] = temp;
                    //Somit wurden die beiden Zahlen im Array getauscht
                    System.out.println(zahlen[i]);
                }
            }
            //n wird um eins reduziert, da wieder eine Zahl sortiert wurde
            n = n-1;
        }
        //Das ganze Array wird durchgegangen und ausgegeben
        for (int i = 0; i< zahlen.length; i++)
        {
            System.out.println(zahlen[i]);   
        }
    }
    
    /**
     * Diese Methode fürht den Selectionsort auf dem Array Zahlen aus
     */
    public void selectionSort()
    {
        //Die Integervariabel links wird als 0 initialisiert
        int links = 0;
        //Die Variabel n wird der Länge des Arrays zahlen gesetzt
        int n = zahlen.length;
        //Instanzierung von der Variabel temp
        int temp;
        while (links < n)
        {
            int min = links;
            for(int i= links+1; i<zahlen.length; i++)
            {
                if (zahlen[i] < zahlen[min])
                {
                    min = i;
                }
            }
            temp = zahlen[min];
            zahlen[min] = zahlen[links];
            zahlen[links] = temp;
            links = links+1;
        }
        for (int i = 0; i< zahlen.length; i++)
        {
            System.out.println(zahlen[i]);   
        }
    }
}
