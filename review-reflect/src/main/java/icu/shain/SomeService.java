package icu.shain;

public class SomeService {
    public void doSomething() {
        System.out.println("public void doSomething()方法执行");
    }
    public String doSomething(String s) {
        System.out.println("public String doSomething(String s)执行");
        return s;
    }
    public String doSomething(String s, int i) {
        System.out.println("public String doSomething(String, int i)执行");
        return s + i;
    }
}