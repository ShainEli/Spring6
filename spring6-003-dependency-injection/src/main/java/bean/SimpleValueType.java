package bean;

import java.io.File;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.time.ZoneId;
import java.time.temporal.Temporal;
import java.util.*;
import java.util.regex.Pattern;

/**
 * @ClassName: SimpleValueType
 * @Description: TODO
 * @Version: 1.0.0
 * @Date: 2023/10/26 10:25
 * @Author:XSS
 **/

public class SimpleValueType {
    /*
    public static boolean isSimpleValueType(Class<?> type) {
        return Void.class != type && Void.TYPE != type && (isPrimitiveOrWrapper(type) ||
                Enum.class.isAssignableFrom(type) ||
                CharSequence.class.isAssignableFrom(type) ||
                Number.class.isAssignableFrom(type) ||
                Date.class.isAssignableFrom(type) ||        //java.util.Date是简单类型
                Temporal.class.isAssignableFrom(type) ||    //Temporal是Java8提供的时间和时区类型
                ZoneId.class.isAssignableFrom(type) ||
                TimeZone.class.isAssignableFrom(type) ||
                File.class.isAssignableFrom(type) ||
                Path.class.isAssignableFrom(type) ||
                Charset.class.isAssignableFrom(type) ||
                Currency.class.isAssignableFrom(type) ||
                InetAddress.class.isAssignableFrom(type) ||
                URI.class == type || URL.class == type ||
                UUID.class == type || Locale.class == type ||
                Pattern.class == type || Class.class == type);
    }
     */
    private int age;
    private Integer age2;

    private boolean flag;
    private Boolean flag2;

    private char ch;
    private Character ch2;

    private Season season;

    private String username;

    private Class clazz;

    private Date birth;

    @Override
    public String toString() {
        return "SimpleValueType{" +
                "age=" + age +
                ", age2=" + age2 +
                ", flag=" + flag +
                ", flag2=" + flag2 +
                ", ch=" + ch +
                ", ch2=" + ch2 +
                ", season=" + season +
                ", username='" + username + '\'' +
                ", clazz=" + clazz +
                ", birth=" + birth +
                '}';
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public void setAge2(Integer age2) {
        this.age2 = age2;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public void setFlag2(Boolean flag2) {
        this.flag2 = flag2;
    }

    public void setCh(char ch) {
        this.ch = ch;
    }

    public void setCh2(Character ch2) {
        this.ch2 = ch2;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
