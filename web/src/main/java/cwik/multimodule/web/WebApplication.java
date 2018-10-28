package cwik.multimodule.web;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication(scanBasePackages = {"cwik.multimodule.web", "cwik.multimodule.service"})
public class WebApplication {

    public static void main(String[] args) {
        run(WebApplication.class, args);
    }
}
