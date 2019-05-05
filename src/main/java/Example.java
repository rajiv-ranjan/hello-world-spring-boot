import java.net.InetAddress;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Example {

	@RequestMapping("/second-springboot")
	String home() {
		StringBuffer message = new StringBuffer();
		message.append("Second Microservice Says Hello From: ");
		try {

			InetAddress localhost = InetAddress.getLocalHost();
			message.append(" POD: "+localhost.getHostAddress().trim());
			
		} catch (Exception e) {
			message.append("ERROR-BLOCK");
		}
		return message.toString();
	}
    

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }

}
