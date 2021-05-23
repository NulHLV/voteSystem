package com.nullv;

import com.github.pagehelper.PageHelper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Properties;

@SpringBootApplication
public class VoteSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(VoteSystemApplication.class, args);
    }

    @Configuration
    class CorsConfig {
        private CorsConfiguration buildConfig() {
            CorsConfiguration corsConfiguration = new CorsConfiguration();
            corsConfiguration.addAllowedOrigin("*"); //允许任何域名
            corsConfiguration.addAllowedHeader("*"); //允许任何头
            corsConfiguration.addAllowedMethod("*"); //允许任何方法
            return corsConfiguration;
        }

        @Bean
        public CorsFilter corsFilter() {
            UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
            source.registerCorsConfiguration("/**", buildConfig()); //注册
            return new CorsFilter(source);
        }
    }

    /**
     * 本地地址映射成虚拟地址
     *
     * @Author NulLV
     * @creat: 2021-05-19 22:26
     * @return:
     */
    @Configuration
    public class SpringMvcConfigurationInitializer extends WebMvcConfigurerAdapter {

        @Override
        public void addResourceHandlers(ResourceHandlerRegistry registry) {

            // 本地图片地址映射到虚拟地址
            registry.addResourceHandler("/Image/**").addResourceLocations("file:F://Image/");
            super.addResourceHandlers(registry);
        }
    }

}
