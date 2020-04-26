package exampleOk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Girl {

    @Autowired
    private Boy boy;

    @PostConstruct
    public void init() {
        boy.sayBoy();
        System.out.println("init girl");
    }

    public void sayGirl()
    {
        System.out.println("I little girl");
    }
}
