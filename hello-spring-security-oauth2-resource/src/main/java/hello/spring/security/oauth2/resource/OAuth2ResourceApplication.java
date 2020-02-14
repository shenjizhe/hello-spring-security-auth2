package hello.spring.security.oauth2.resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

import java.io.Console;

@SpringBootApplication
@MapperScan(basePackages = "com.thirdlucky.hello.spring.security.oauth2.resource.mapper")
public class OAuth2ResourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OAuth2ResourceApplication.class, args);
	}

}
