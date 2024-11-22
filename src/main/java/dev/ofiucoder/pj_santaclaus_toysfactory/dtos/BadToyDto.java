package dev.ofiucoder.pj_santaclaus_toysfactory.dtos;

public class BadToyDto {

    public String title;
    public String content;

    public BadToyDto(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

}
