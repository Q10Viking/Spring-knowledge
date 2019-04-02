package tacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication   // <1>
public class TacoCloudApplication implements WebMvcConfigurer{

  public static void main(String[] args) {
    SpringApplication.run(TacoCloudApplication.class, args); // <2>
  }


}
