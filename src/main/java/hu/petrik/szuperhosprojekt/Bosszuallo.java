package hu.petrik.szuperhosprojekt;

import java.text.MessageFormat;

public abstract class Bosszuallo implements Szuperhos {
    private double szuperero;
    private boolean vanEGyengesege;

    public Bosszuallo(double szuperero, boolean vanEGyengesege) {
        this.szuperero = szuperero;
        this.vanEGyengesege = vanEGyengesege;
    }

    public abstract boolean megmentiAVilagot();

    @Override
    public int mekkoraAzEreje() {
        return (int) this.szuperero;
    }

    @Override
    public boolean legyoziE(Szuperhos masik) {
        if (masik instanceof Bosszuallo) {
            Bosszuallo masikBosszuallo = (Bosszuallo) masik;
            if (masikBosszuallo.vanEGyengesege && this.szuperero > masikBosszuallo.szuperero) {
                return true;
            } else if (masikBosszuallo.getClass().getSimpleName().equals("Batman") && this.szuperero >= 2 * masikBosszuallo.szuperero) {
                return true;
            }
        }
        return false;
    }

    // Getter és Setter metódusok
    public double getSzuperero() {
        return szuperero;
    }

    public void setSzuperero(double szuperero) {
        this.szuperero = szuperero;
    }

    public boolean isVanEGyengesege() {
        return vanEGyengesege;
    }

    public void setVanEGyengesege(boolean vanEGyengesege) {
        this.vanEGyengesege = vanEGyengesege;
    }

    // Szöveges formára alakítás
    @Override
    public String toString() {
        String gyengesegeText = vanEGyengesege ? "van gyengesége" : "nincs gyengesége";
        return MessageFormat.format("Szupererő: {0, number, #.##}; {1}", szuperero, gyengesegeText);
    }
}

