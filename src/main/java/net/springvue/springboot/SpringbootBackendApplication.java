package net.springvue.springboot;

import net.springvue.springboot.entity.Employee;
import net.springvue.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {

		Employee employee1 = Employee.builder()
				.firstName("Moussa")
				.lastName("Traore")
				.email("moussatra@gmail.com")
				.build();
		Employee employee2 = Employee.builder()
				.firstName("Seydou")
				.lastName("Camara")
				.email("seydoucam@gmail.com")
				.build();
		Employee employee3 = Employee.builder()
				.firstName("Lay")
				.lastName("Ballo")
				.email("layballo@gmail.com")
				.build();
		Employee employee4 = Employee.builder()
				.firstName("Awa")
				.lastName("Forgeot")
				.email("awa@gmail.com")
				.build();
		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
		employeeRepository.save(employee3);
		employeeRepository.save(employee4);

	}
}
