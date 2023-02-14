package com.mycompany.labb2.filecrawler;

import java.util.Scanner;
import java.io.File;

public class FileCrawler {

/* Tasks:
 * [x] 1. Starta med meddelande som säger åt användare att skriva in sökord
 * [ ] 2. Om fil innehåller textsträng -> absolut sökväg skrivs ut på egen rad
 * [ ] 3. Om fil inte innehåller sträng -> ingenting skrivs ut
 * [ ] 4. Om fil eller katalog inte går att läsa -> error med fils/katalogs absoluta sökväg System.error
 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to FileCrawler." + "\n" + "Please enter term to search for:");
        String searchTerm = scan.nextLine();
        String startDir; // startDir / root --> noder --> löv -- (binära sökträd)
        // ett "objekt" kan inte vara både mapp och fil samtidigt
    }

    // public static void scan = new 
    // public static void searchFile = 
    // Notes, handledning med Alvin 220923
    // canRead, isFile/isDirectory -- fil/dir (bool)
    // 1. rekursivt klättra ner i filträdet
    //      - komma till en fil som är läsbar
    // 2. söka igenom filer
    // - Anropa searchFile i scan
    // - Gå djupare i mappstruktur?
    // - Söka igenom filer?
    /* Mål:
           - Strömmar / streams (input/output)
           - Filer
           - Felhantering / exceptions
           - Rekursion
        
          Uppgiften går ut på att skriva ett simpelt lokalt sökprogram som tar in en textsträng från 
          System.in och gör en sökning i katalogen där programmet körs, samt dess underkataloger, i 
          alla filer för att se om den angivna textsträngen finns i filen.
        
          - Programmet ska starta med ett meddelande som säger åt användaren att skriva in 
            ett sökord.
        
        import java.util.Scanner;
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to FileCrawler. This program takes an input,
        a search term, and uses it to search through the files in your current
        as well as sub directories.

        Please enter term to search for:");
        String searchString = scanner.nextLine();
        
        
          - Om filen innehåller textsträngen...
        try
        if (file contains searchString) {
        
        /*  ...så ska filens ABSOLUTA SÖKGVÄG -- hur hitta och skriva ut
                            sökvägen? Metod för det? Googla det...
     */
 /*
        // skrivas ut på en egen 
        // rad till System.out. 
            System.out.println(filens sökväg);
        }
          
          - Om filen inte innehåller textsträngen så ska ingenting skrivas ut för den filen.
        else (file !contains searchString)
            Skip output.
        
        catch (Exception e) // e är alltså en Exception var
            System.err.println(); // Throw / output exception System.error ouput path
          - Om filen (eller en katalog) inte går att läsa så ska ett felmeddelande som minst 
            innehåller filens/katalogens absoluta sökväg skrivas ut till System.error. -- try catch?
        
     */
}
