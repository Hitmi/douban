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
public class Book implements Serializable {
    private static final long serialVersionUID = 5572479366225992217L;
    private String icon_url;
    private String name;
    private String author;
    private String intro;
}
