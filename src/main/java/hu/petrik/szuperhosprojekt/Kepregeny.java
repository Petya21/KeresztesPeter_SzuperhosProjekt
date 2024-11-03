package hu.petrik.szuperhosprojekt;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Kepregeny {
    public static List<Szuperhos> szuperhosLista = new ArrayList<>();

    public static void szereplok(String fajlEleres) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fajlEleres))) {
            String sor;
            while ((sor = reader.readLine()) != null) {
                String[] reszek = sor.split(";");
                String hosTipus = reszek[0].trim();
                int kutyuSzam = Integer.parseInt(reszek[1].trim());

                Szuperhos szuperhos;
                if ("Batman".equalsIgnoreCase(hosTipus)) {
                    szuperhos = new Batman();
                } else if ("Vasember".equalsIgnoreCase(hosTipus)) {
                    szuperhos = new Vasember();
                } else {
                    continue;
                }

                for (int i = 0; i < kutyuSzam; i++) {
                    if (szuperhos instanceof Milliardos) {
                        ((Milliardos) szuperhos).kutyutKeszit();
                    }
                }

                szuperhosLista.add(szuperhos);
            }
        } catch (IOException e) {
            System.err.println("Hiba történt a fájl olvasása közben: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Hibás formátum a fájlban: " + e.getMessage());
        }
    }

    public static void szuperhosok() {
        for (Szuperhos hos : szuperhosLista) {
            System.out.println(hos);
        }
    }

    public static void main(String[] args) {
        szereplok("szuperhosok.txt");

        szuperhosok();
    }
}


