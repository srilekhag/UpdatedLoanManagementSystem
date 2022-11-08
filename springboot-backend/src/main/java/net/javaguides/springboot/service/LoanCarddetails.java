package net.javaguides.springboot.service;
import java.util.Optional;

import net.javaguides.springboot.model.LoanCard;

public interface LoanCarddetails {
	
	public Optional<LoanCard> getLoanById(String loan_Id);
	
}
