package main.java.net.viralpalet.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by saeedtavana on 4/5/18.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "main.java.net.viralpalet.spring")
public class AppConfig {

}
