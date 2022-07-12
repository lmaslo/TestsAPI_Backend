package restbackend;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class LiberyApplication {

	public static void main(String[] args) {
		SpringApplication.run(LiberyApplication.class, args);
	}

	@Bean
	public ObjectMapper jacksonMapper() {
		return new ObjectMapper().setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE);
	}


}
