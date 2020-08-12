package org.micah.security.config;

import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @program: eladmin-cloud
 * @description: 资源服务自动配置
 * @author: Micah
 * @create: 2020-08-04 19:59
 **/
@ConfigurationPropertiesScan
@ComponentScan("org.micah.security")
public class ResourceServerAutoConfiguration {

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
