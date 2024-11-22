package dev.ofiucoder.pj_santaclaus_toysfactory.models;

public class GoodToy extends Toy {
    private String brand;
    private int recommendedAge;
    private String category;

    public GoodToy(String id, String customId, String title, String brand, int recommendedAge, String category) {
        super(id, customId, title, 1);
        this.brand = brand;
        this.recommendedAge = recommendedAge;
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public int getRecommendedAge() {
        return recommendedAge;
    }

    public String getCategory() {
        return category;
    }


}
