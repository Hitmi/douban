package cn.analysys.douban;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
@MapperScan("cn.analysys.douban.mapper")
public class DoubanApplication {
	public static void main(String[] args) {
		SpringApplication.run(DoubanApplication.class, args);
	}
}
