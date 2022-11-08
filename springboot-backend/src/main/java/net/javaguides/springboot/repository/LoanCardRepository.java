package net.javaguides.springboot.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.LoanCard;

@Repository

public interface LoanCardRepository extends JpaRepository<LoanCard, String>{

	
}
