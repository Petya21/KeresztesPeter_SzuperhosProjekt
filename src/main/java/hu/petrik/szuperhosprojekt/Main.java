package hu.petrik.szuperhosprojekt;

import java.io.IOException;

import static hu.petrik.szuperhosprojekt.Kepregeny.szereplok;
import static hu.petrik.szuperhosprojekt.Kepregeny.szuperhosok;

public class Main {

    public static void main(String[] args) {

        try {
            Kepregeny.szereplok("src/test/resources/szuperhos.txt");
            Kepregeny.szuperhosok();
        } catch (Exception e) {
            System.err.println("Általános hiba történt: " + e.getMessage());
        }
    }
}