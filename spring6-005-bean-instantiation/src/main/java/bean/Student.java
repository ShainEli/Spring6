package bean;

import java.util.Date;

/**
 * @ClassName: Student
 * @Description: TODO
 * @Version: 1.0.0
 * @Date: 2023/10/31 15:42
 * @Author:XSS
 **/
public class Student {

    // java.util.Date 在Spring当中被当做简单类型。但是简单类型的话，注入的日期字符串格式有要求
    // java.util.Date 在Spring当中也可以被当做非简单类型
    private Date birth;

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "birth=" + birth +
                '}';
    }
}
