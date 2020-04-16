package cn.analysys.douban.pojo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class FilmDetailParam implements Serializable {

    private static final long serialVersionUID = -2875415980332577340L;
    private String id;

    private Integer limitnum;

}
