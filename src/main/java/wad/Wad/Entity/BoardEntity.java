package wad.Wad.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

import java.sql.Date;

public class BoardEntity {

    @Id
    @Column(name = "boardId", nullable = false, length = 20)
    private long boardid;

    @Column(name = "like", nullable = false, length = 20)
    private String like;

    @Column(name = "date", nullable = false)
    private Date date;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "title", nullable = false, length = 20)
    private String title;

    @Column(name = "content", nullable = false, length = 20)
    private String content;


}
