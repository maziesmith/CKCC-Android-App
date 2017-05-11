package kh.edu.rupp.ckcc.ckcc.datamodel;

/**
 * CKCC
 * Created by leapkh on 4/25/17.
 */

public class Article {

    private int id;
    private String title;
    private String content;
    private int date;
    private String thumbnailUrl;

    public Article(int id, String title, String content, int date, String thumbnailUrl) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.date = date;
        this.thumbnailUrl = thumbnailUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }
}
