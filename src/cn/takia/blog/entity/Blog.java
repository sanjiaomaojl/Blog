package cn.takia.blog.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 博客相关的属相
 */
public class Blog implements Serializable {
    private String b_diary_id;
    private String b_diary_title;
    //普通的内容
    private String b_diary_body;
    //MarkDown中的数据
    private String b_diary_show_body;
    private String b_diary_create_time;
    private String b_diary_update_time;

    public String getB_diary_id() {
        return b_diary_id;
    }

    public void setB_diary_id(String b_diary_id) {
        this.b_diary_id = b_diary_id;
    }

    public String getB_diary_title() {
        return b_diary_title;
    }

    public void setB_diary_title(String b_diary_title) {
        this.b_diary_title = b_diary_title;
    }

    public String getB_diary_body() {
        return b_diary_body;
    }

    public void setB_diary_body(String b_diary_body) {
        this.b_diary_body = b_diary_body;
    }

    public String getB_diary_show_body() {
        return b_diary_show_body;
    }

    public void setB_diary_show_body(String b_diary_show_body) {
        this.b_diary_show_body = b_diary_show_body;
    }

    public String getB_diary_update_time() {
        return b_diary_update_time;
    }

    public void setB_diary_update_time(String b_diary_update_time) {
        this.b_diary_update_time = b_diary_update_time;
    }

    public String getB_diary_create_time() {
        return b_diary_create_time;
    }

    public void setB_diary_create_time(String b_diary_create_time) {
        this.b_diary_create_time = b_diary_create_time;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "b_diary_id='" + b_diary_id + '\'' +
                ", b_diary_title='" + b_diary_title + '\'' +
                ", b_diary_body='" + b_diary_body + '\'' +
                ", b_diary_show_body='" + b_diary_show_body + '\'' +
                ", b_diary_create_time='" + b_diary_create_time + '\'' +
                ", b_diary_update_time='" + b_diary_update_time + '\'' +
                '}';
    }
}
