package PostConstruct.exampleOk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Boy {

    @Autowired
    private Girl girl;

    @PostConstruct
    public void init()
    {
       girl.sayGirl();
        System.out.println("initBiy");
    }

    public void sayBoy(){
        System.out.println("I little boy");
    }

}
