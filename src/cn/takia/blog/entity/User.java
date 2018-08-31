package cn.takia.blog.entity;

import java.io.Serializable;

/**
 * 用户类
 */
public class User implements Serializable {
    private String b_user_id;
    private String b_user_name;
    private String b_user_password;

    public String getB_user_id() {
        return b_user_id;
    }

    public void setB_user_id(String b_user_id) {
        this.b_user_id = b_user_id;
    }

    public String getB_user_name() {
        return b_user_name;
    }

    public void setB_user_name(String b_user_name) {
        this.b_user_name = b_user_name;
    }

    public String getB_user_password() {
        return b_user_password;
    }

    public void setB_user_password(String b_user_password) {
        this.b_user_password = b_user_password;
    }

    @Override
    public String toString() {
        return "User{" +
                "b_user_id='" + b_user_id + '\'' +
                ", b_user_name='" + b_user_name + '\'' +
                ", b_user_password='" + b_user_password + '\'' +
                '}';
    }
}
