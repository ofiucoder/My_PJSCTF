package dev.ofiucoder.pj_santaclaus_toysfactory.singletons;

import dev.ofiucoder.pj_santaclaus_toysfactory.db.BadToyDatabase;

public class BadToyDatabaseSingleton {

    private static BadToyDatabase INSTANCE;

    private BadToyDatabaseSingleton() {}

    public static BadToyDatabase getInstance() {
        if (INSTANCE == null) INSTANCE = new BadToyDatabase();
        return INSTANCE;
    }
}