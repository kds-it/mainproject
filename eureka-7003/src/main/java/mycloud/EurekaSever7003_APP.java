package mycloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by kds on 2020/9/7.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaSever7003_APP {
    public static void main(String[] args) {
        SpringApplication.run(EurekaSever7003_APP.class);
    }
}
    