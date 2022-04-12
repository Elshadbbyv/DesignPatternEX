package iktlab.designpatternex.designpatternex;



import iktlab.designpatternex.designpatternex.Builder.User;
import iktlab.designpatternex.designpatternex.Builder.UserBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DesignPatternExApplication {

    public static void main(String[] args) {
        User user1 = new UserBuilder("Elshad", "Babayev", 01L, 28,"Baku").build();
        System.out.println(user1);

        SpringApplication.run(DesignPatternExApplication.class, args);

    }

}
