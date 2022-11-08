package net.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.springboot.model.LoanCard;
import net.javaguides.springboot.repository.LoanCardRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
	
	@Autowired
	private LoanCardRepository loancardRepository;
	
	@Override
	public void run(String... args) throws Exception {
		/*LoanCard loancard  = new LoanCard();
		loancard.setLoan_type("Furniture");
		loancard.setDuration(3);
		loancardRepository.save(loancard);
		
		LoanCard loancard1 = new LoanCard();
		loancard1.setLoan_type("Home");
		loancard1.setDuration(2);
		loancardRepository.save(loancard1);*/
		
		/*LoanCard loancard = new LoanCard();
		loancard.setLoan_id("L0001");
		loancard.setLoan_type("Furniture");
		loancard.setDuration(5);
		loancardRepository.save(loancard);*/
	}
	

}
