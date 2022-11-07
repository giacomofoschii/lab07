package it.unibo.nestedenum;

import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;

/**
 * Implementation of {@link MonthSorter}.
 */
public final class MonthSorterNested implements MonthSorter {

    public enum Month {
        GENNAIO("Gennaio", 31),
        FEBBRAIO("Febbraio", 28),
        MARZO("Marzo", 31),
        APRILE("Aprile", 30),
        MAGGIO("Maggio", 31),
        GIUGNO("Giugno", 30),
        LUGLIO("Luglio", 31),
        AGOSTO("Agosto", 31),
        SETTEMBRE("Settembre", 30),
        OTTOBRE("Ottobre", 31),
        NOVEMBRE("Novembre", 30),
        DICEMBRE("Dicembre", 31);

        private final String actualName;
        private final int days;

        private Month(final String actualName, final int days){
            this.actualName = actualName;
            this.days = days;
        }

        /*public String fromString(String name){
            
        }*/
    }

    @Override
    public Comparator<String> sortByDays() {
        return null;
    }

    @Override
    public Comparator<String> sortByOrder() {
        return null;
    }
}
