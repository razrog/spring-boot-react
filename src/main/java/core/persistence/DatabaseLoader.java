package core.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final CustomerRepository repository;

    @Autowired
    public DatabaseLoader(CustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Customer(Long.parseLong("212134352"), "Frodo Baggins", "Shire", "172450221"));
        this.repository.save(new Customer(Long.parseLong("111222200"), "Danni Devito", "Hollywood", "172200200"));
        this.repository.save(new Customer(Long.parseLong("002333111"), "Bruce Wayne", "Cave", "172123345"));
        this.repository.save(new Customer(Long.parseLong("002333222"), "Lara Frost", "Cave", "888444112"));
        this.repository.save(new Customer(Long.parseLong("098988811"), "John Doe", "unknown", "87465255"));
    }
}