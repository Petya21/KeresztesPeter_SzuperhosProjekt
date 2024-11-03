package hu.petrik.szuperhosprojekt;
import java.util.Random;
import java.text.MessageFormat;

public class Vasember extends Bosszuallo implements Milliardos {

    public Vasember() {
        super(150.0, true);  // Szupererő: 150, van gyengesége
    }

    @Override
    public void kutyutKeszit() {
        Random random = new Random();
        double novekedes = random.nextDouble() * 10; // 0-10 közötti véletlenszám
        setSzuperero(getSzuperero() + novekedes);
    }

    @Override
    public boolean megmentiAVilagot() {
        return getSzuperero() > 1000;
    }

    @Override
    public String toString() {
        String gyengesegeText = isVanEGyengesege() ? "van gyengesége" : "nincs gyengesége";
        return MessageFormat.format("Vasember | Szupererő: {0, number, #.##}; {1}", getSzuperero(), gyengesegeText);
    }
}

