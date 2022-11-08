package net.javaguides.springboot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.LoanCard;
import net.javaguides.springboot.repository.LoanCardRepository;

@Service
public class LoanCarddetailsImpl implements LoanCarddetails{
	
	@Autowired
	LoanCardRepository loancardrepo;
	
	@Override
    public Optional<LoanCard> getLoanById(String loan_id) {
        return loancardrepo.findById(loan_id);
    }
}
