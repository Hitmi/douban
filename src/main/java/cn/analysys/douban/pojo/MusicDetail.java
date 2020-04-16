package cn.analysys.douban.pojo;

import lombok.*;

import java.io.Serializable;
import java.util.List;

/**
 * 用于存储一个音乐的详情页信息
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MusicDetail implements Serializable {
    private static final long serialVersionUID = 662692455448902539L;
    private Music music;
    private List<MusicReview> reviews;
}
