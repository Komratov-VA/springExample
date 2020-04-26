package PostConstruct.exampleWithCommandLineRunner;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Boy implements CommandLineRunner {

    @Autowired
    private Girl girl;

    @Getter
    private String toy;

    @PostConstruct
    private void setToy(){
        this.toy = "car";
    }

    public void run(String... args) throws Exception {
        System.out.println(girl.getToy().toLowerCase());
    }
}
