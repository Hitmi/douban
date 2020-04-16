package cn.analysys.douban.pojo;

import java.io.Serializable;
import java.util.Date;

public class FilmParam implements Serializable {
    private static final long serialVersionUID = -3496819884874144617L;
    private Date date;
    private Integer area_id;
    private Integer limitnum;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getArea_id() {
        return area_id;
    }

    public void setArea_id(Integer area_id) {
        this.area_id = area_id;
    }

    public Integer getLimitnum() {
        return limitnum;
    }

    public void setLimitnum(Integer limitnum) {
        this.limitnum = limitnum;
    }
}
