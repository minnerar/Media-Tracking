import java.util.Objects;

public class Book {

    private String name;
    private String website;
    private String author;
    private Boolean series;
    private Boolean completed;
    private String imageUrl;
    private String genre;

    // constructors
    public Book() {}

    public Book(String name, String website, String author, Boolean series, Boolean completed, String imageUrl) {
        this.name = name;
        this.website = website;
        this.author = author;
        this.series = series;
        this.completed = completed;
        this.imageUrl = imageUrl;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Boolean getSeries() {
        return series;
    }

    public void setSeries(Boolean series) {
        this.series = series;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    // to string override
    @java.lang.Override
    public java.lang.String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", website='" + website + '\'' +
                ", author='" + author + '\'' +
                ", series=" + series +
                ", completed=" + completed +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }

}