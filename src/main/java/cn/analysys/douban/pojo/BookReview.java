package cn.analysys.douban.pojo;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class BookReview implements Serializable {
    private static final long serialVersionUID = 8339537792540667996L;
    private Integer id;
    private String name;
    private String author;
    private String publisher;
    private String price;
    private String subhead;
    private String press;
    private String publish_date;
    private String translator;
    private String pagination;
    private String binding;
    private String isbn;
    private Double grade;
    private String intro;
    private Integer essay_count;
    private Integer review_count;
    private String icon_url;
    private String content;
}
