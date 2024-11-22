package dev.ofiucoder.pj_santaclaus_toysfactory.dtos;

public class GoodToyDto {

    private String title;
    private String brand;
    private int recommendedAge;
    private String category;

    public GoodToyDto(String title, String brand, int recommendedAge, String category) {

        this.title = title;
        this.brand = brand;
        this.recommendedAge = recommendedAge;
        this.category = category;
    }

    public String getTitle() {
        return title;
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
