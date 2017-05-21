package pluralsight.springboot;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableOAuth2Sso
public class ReportController {
	
	@RequestMapping("/")
	public String loadHome(){
		return "home";
	}
}
