package top.youlanqiang.fazer;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/**
 * @author youlanqiang
 * created in 2021/1/21 18:55
 */

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@ServletComponentScan
@EnableWebSecurity
public class FazerApplication  {

    public static void main(String[] args) {
        SpringApplication.run(FazerApplication.class, args);
    }


}