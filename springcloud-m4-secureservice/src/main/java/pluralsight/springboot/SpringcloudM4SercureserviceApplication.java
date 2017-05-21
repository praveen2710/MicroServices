package pluralsight.springboot;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableResourceServer // This helps it work with oAuth2 instead of credentials
public class SpringcloudM4SercureserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudM4SercureserviceApplication.class, args);
	}
	
	@RequestMapping("/tolldata")
	public ArrayList<TollUsage> getTollData(){
		TollUsage instance1 = new TollUsage("200", "station150", "B65GT1W", "2016-09-30T06:31:22");
		TollUsage instance2 = new TollUsage("201", "station119", "AHY673B", "2016-09-30T06:32:50");
		TollUsage instance3 = new TollUsage("202", "station150", "ZN2GP0", "2016-09-30T06:37:01");
		
		ArrayList<TollUsage> tolls = new ArrayList<TollUsage>();
		tolls.add(instance1);
		tolls.add(instance2);
		tolls.add(instance3);
		
		return tolls;
	}
	
//	Dummy Databases
	public class TollUsage{
		public String Id;
		public String stationId;
		public String licensePlate;
		public String timeStamp;
		
		public TollUsage(){}

		public TollUsage(String id, String stationId, String licensePlate, String timeStamp) {
			super();
			this.Id = id;
			this.stationId = stationId;
			this.licensePlate = licensePlate;
			this.timeStamp = timeStamp;
		}
	}
	
}
