package cn.takia.blog.util;

import java.util.UUID;

public class BlogUtil {

    //利用UUID生成主键
    public static String createId(){
        UUID uuid = UUID.randomUUID();
        String id = uuid.toString();
        return id.replace("-", "");
    }
}
