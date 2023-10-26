package bean;

/**
 * @ClassName: MathBean
 * @Description: TODO
 * @Version: 1.0.0
 * @Date: 2023/10/26 14:26
 * @Author:XSS
 **/
public class MathBean {
    private String result;
    public void setResult(String result){
        this.result = result;
    }

    @Override
    public String toString() {
        return "MathBean{" +
                "result='" + result + '\'' +
                '}';
    }
}
