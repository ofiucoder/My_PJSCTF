package dev.ofiucoder.pj_santaclaus_toysfactory.repository;

@SuppressWarnings("rawtypes")
public class ToyRepository {

    private IDatabase db;

    public void setDB(String type) {
        // setter injection
        if (type == "good_toy")
            this.db = GoodToyDatabaseSingleton.getInstance();

        if (type == "bad_toy")
            this.db = BadToyDatabaseSingleton.getInstance();
    }

    @SuppressWarnings("unchecked")
    public void saveGoodToy(GoodToy toy) {
        db.save(toy);
    }

    @SuppressWarnings("unchecked")
    public void saveBadToy(BadToy toy) {
        db.save(toy);
    }

}
-