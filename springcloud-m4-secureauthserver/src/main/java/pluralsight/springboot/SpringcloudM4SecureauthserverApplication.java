package pluralsight.springboot;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAuthorizationServer
@EnableResourceServer
@RestController
public class SpringcloudM4SecureauthserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudM4SecureauthserverApplication.class, args);
	}
	
//	This is validate user from other services
	@RequestMapping("/user")
	public Principal User(Principal user){
		return user;
	}
}
