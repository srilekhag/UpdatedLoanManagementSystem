package net.javaguides.springboot.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "loan_card2")
public class LoanCard {

	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long serial_id;
	
	@Id
	@Column(name = "loan_id")
	private String loan_id;
	
	@Column(name = "loan_type")
	private String loan_type;
	
	@Column(name="duration")
	private int duration;
	
	public LoanCard() {
		
	}
	public LoanCard(String loan_id, String loan_type, int duration) {
		super();
		this.loan_id = loan_id;
		this.loan_type = loan_type;
		this.duration = duration;
	}

	public Long getSerial_id() {
		return serial_id;
	}
	public void setSerial_id(Long serial_id) {
		this.serial_id = serial_id;
	}
	public String getLoan_id() {
		return loan_id;
	}
	public void setLoan_id(String loan_id) {
		this.loan_id = loan_id;
	}
	public String getLoan_type() {
		return loan_type;
	}
	public void setLoan_type(String loan_type) {
		this.loan_type = loan_type;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
}
