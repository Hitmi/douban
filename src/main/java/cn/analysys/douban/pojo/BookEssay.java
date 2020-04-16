package cn.analysys.douban.pojo;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Setter
@Getter
@ToString
@EqualsAndHashCode
public class BookEssay implements Serializable {
    private static final long serialVersionUID = -8854918546946559701L;
    private Integer id;
    private String book_id;
    private String user_icon;
    private String user_name;
    private String content;
    private String discuss_date;
    private Integer useful_count;
    private Integer unuseful_count;
    private Integer reply_count;
}
