package streams;

// This file is made by EmJey
// Project: JavaPractice.java
// FileName: Movie.java
// Date: 2024/06/22
// Modified Date: 2024/06/23
// Email: emjeydev@gmail.com
// Github: emjeydev

public class Movie {
    private String title;
    private int likes;

    public Movie(String title, int likes) {
        this.title = title;
        this.likes = likes;
    }


    public int getLikes() {
        return likes;
    }

    public String getTitle() {
        return title;
    }
}
