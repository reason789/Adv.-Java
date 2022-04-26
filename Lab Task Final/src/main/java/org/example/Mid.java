package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("mid")
public class Mid  {

    @Value("${exam.going.mid}")
    private String Mid;


    public String methodA() {
        return "Mid Exam is Running";
    }

    public String getMid() {
        return Mid;
    }

    public void setMid(String mid) {
        this.Mid = mid;
    }
}
