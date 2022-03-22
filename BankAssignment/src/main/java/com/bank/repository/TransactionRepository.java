package com.bank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.model.Transaction;
import com.bank.model.Transactionprimarykey;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Transactionprimarykey>{
	
	
	

	public List<Transaction> findBytransactionprimarykeyAccountNo(int accountNo);
	
	
	/*JPQL*/
/*	@Query("select u from u transaction_details u where account_no=accountNo")
  public Integer findBytransactionprimarykeyAccountNo(@Param("accountNo") Integer accountNo)
 
 */
	
	/*Nataive Query
	 * 
      @Query(value="select * from transaction_details where account_no=accountNo",NativeQuery=true)
      public Integer findBytransactionprimarykeyAccountNo(@Param("accountNo") Integer accountNO)
	  
	 public List<Transaction> findBytransactionprimarykeyAccountNo(int accountNo);
	
	 */

}
