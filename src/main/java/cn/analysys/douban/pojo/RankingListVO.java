package cn.analysys.douban.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * Description:
 * 排行榜需要的数据
 *
 * @author houyi
 * @version 1.0
 * @date 2019/11/25 20:39
 * @since JDK 1.8
 */
@Getter
@Setter
@ToString
public class RankingListVO implements Serializable {

    private static final long serialVersionUID = -7052846575193441333L;
    private String id;

    private String name;

    private String player;

    private String genre;

    private String releaseDate;

}