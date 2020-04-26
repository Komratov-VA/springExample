package PostConstruct.exampleNPE;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Boy {

    @Autowired
    private Girl girl;

    @Getter
    private String toy;

    @PostConstruct
    public void init()
    {
        setToy();
        System.out.println(girl.getToy().toLowerCase());
    }

    private void setToy(){
        this.toy = "car";
    }

}
