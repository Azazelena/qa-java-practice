package qa;

public class Post {
    public String title;
    public String body;
    public int userId;
    public int id; // JSONPlaceholder returns this generated identifier

    public Post() {} // Required by Jackson for deserialization

    public Post(String title, String body, int userId) {
        this.title = title;
        this.body = body;
        this.userId = userId;
    }
}
