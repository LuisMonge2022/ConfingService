package idat.com.ConfingService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfingServiceApplication.class, args);
	}

}
