package cn.analysys.douban.pojo;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class FilmDetail {

    private String film_id;
    private String name;
    private String director;
    private String scriptwriter;
    private String actor;
    private String genre;
    private String area;
    private Integer area_id;
    private String language;
    private String release_time;
    private String mins;
    private String alternate_name;
    private String imdb;
    private Float grade;
    private String review_num;
    private String essay_num;
    private String comment_num;
    private String content;

}
