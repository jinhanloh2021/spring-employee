package net.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Jin Han");
		employee.setLastName("Loh");
		employee.setEmailId("test@test.com");
		employeeRepository.save(employee);

		Employee employee2 = new Employee();
		employee2.setFirstName("Jinathan");
		employee2.setLastName("Han");
		employee2.setEmailId("jinathan@test.com");
		employeeRepository.save(employee2);
	}
}
