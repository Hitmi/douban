package cn.analysys.douban.pojo;

import lombok.*;

import java.io.Serializable;

/**
 * 用于存储一条乐评的信息
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MusicEssay implements Serializable {
    private static final long serialVersionUID = 4114808874213806756L;

    private Integer id;
    private String songId;
    private String userIcon;
    private String userName;
    private String contents;
    private String discussDate;
    private Integer usefulCount;
    private Integer unusefulCount;
    private Integer replayCount;
    private String contentsTitle;

}
