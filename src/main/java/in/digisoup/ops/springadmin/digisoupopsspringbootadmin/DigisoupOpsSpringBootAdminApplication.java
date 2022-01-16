package in.digisoup.ops.springadmin.digisoupopsspringbootadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication
public class DigisoupOpsSpringBootAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigisoupOpsSpringBootAdminApplication.class, args);
	}

}
