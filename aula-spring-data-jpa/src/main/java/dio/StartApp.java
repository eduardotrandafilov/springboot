package dio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.model.Users;
import dio.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner {

	@Autowired
	private UserRepository repository;
	@Override
	public void run(String... args) throws Exception {
		Users user = new Users();
		user.setName("eduardo");
		user.setUsername("edu");
		user.setPassword("123");
		
		repository.save(user);
		
		for(Users u: repository.findAll()) {
			System.out.println(u);
		}

	}

}
