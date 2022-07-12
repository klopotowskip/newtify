package sk.best.newtify.backend.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.util.UUID;

@Entity
public class Article {
    @Id
    private String uuid = UUID.randomUUID().toString();

    private String title;
    private String shortTitle;

    //It means long text
    @Lob
    private String text;
    private Long createdAt;
    private String author;
}
