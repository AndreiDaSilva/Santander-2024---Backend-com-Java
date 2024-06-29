package dio.aula;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.aula.repository.UserRepository;

@Component
public class StarApp implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;
    
    @Override
    public void run(String... args) throws Exception {
        

        System.out.println(userRepository.findById(1));
    }
    
}
