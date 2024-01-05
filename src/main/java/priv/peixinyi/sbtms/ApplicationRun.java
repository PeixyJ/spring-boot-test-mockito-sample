package priv.peixinyi.sbtms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author peixinyi
 */
@MapperScan(basePackages = "priv.peixinyi.sbtms.mapper")
@SpringBootApplication
public class ApplicationRun {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun.class, args);
    }

}
