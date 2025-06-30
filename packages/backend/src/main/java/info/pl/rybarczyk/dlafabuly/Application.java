package info.pl.rybarczyk.dlafabuly;

import info.pl.rybarczyk.dlafabuly.user.User;
import info.pl.rybarczyk.dlafabuly.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String ...args){
		List<User> users = userRepository.findAll();
		users.forEach(System.out::println);
	}
}
