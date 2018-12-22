package cn.edu.nju.software.judge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class JudgeApplication {

    public static void main(String[] args) {
        SpringApplication.run(JudgeApplication.class, args);
    }

}

