package org.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("final")
public class Final {

    private Mid mid;

    /*public ClassB() {
    }*/

    @Autowired
    public Final(Mid mid) {
        this.mid = mid;
        /*System.out.println(cA1.methodA());*/
    }


}
