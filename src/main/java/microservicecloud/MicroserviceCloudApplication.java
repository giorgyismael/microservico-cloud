package microservicecloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer //Habilita o server para ser um propagador de configurações
public class MicroserviceCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceCloudApplication.class, args);
	}

}
