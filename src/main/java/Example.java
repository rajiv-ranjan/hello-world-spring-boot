import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Example {

	@RequestMapping("/springboot")
	String home() {
		StringBuffer message = new StringBuffer();
		message.append("Hello From: ");
		try {

			InetAddress localhost = InetAddress.getLocalHost();
			message.append(" POD: "+localhost.getHostAddress().trim());
			
		} catch (Exception e) {
			message.append("ERROR-BLOCK");
		}
		return message.toString();
	}
    @RequestMapping("/hello-springboot")
    String home() {
        return "Hello World - v3!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }

}
