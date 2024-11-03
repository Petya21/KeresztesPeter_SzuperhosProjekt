package hu.petrik.szuperhosprojekt;
import java.text.MessageFormat;

public class Batman implements Szuperhos, Milliardos {
    private double lelemenyesseg;

    public Batman() {
        this.lelemenyesseg = 100.0;
    }

    @Override
    public void kutyutKeszit() {
        this.lelemenyesseg += 50;
    }

    @Override
    public int mekkoraAzEreje() {
        return (int) (this.lelemenyesseg * 2);
    }

    @Override
    public boolean legyoziE(Szuperhos masik) {
        return masik.mekkoraAzEreje() < this.lelemenyesseg;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Batman: leleményesség: {0, number, #.##}", this.lelemenyesseg);
    }

    public double getLelemenyesseg() {
        return lelemenyesseg;
    }

    public void setLelemenyesseg(double lelemenyesseg) {
        this.lelemenyesseg = lelemenyesseg;
    }
}

