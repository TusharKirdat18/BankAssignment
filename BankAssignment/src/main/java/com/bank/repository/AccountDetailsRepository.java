package com.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.model.AccountDetails;

@Repository
public interface AccountDetailsRepository extends JpaRepository<AccountDetails,Integer>{
	
	public AccountDetails findByaccountNo(int accountNo);
	
	
	
	/*JPQL*/
	  
	 /*@Query("select u from account_details u where u.account_no=accountNo")
	 public  Integer findByaccountNo(@Param(accountNo) integer accountNo);
	  */
	 
	/*Natative Query*/
	
	/*@Query(value="select * from account_details where account_no=accountNo",NativeQuery=true)
	 * 	public Integer findByaccountNo(@Param("accountNo") Integer accountNo);

	 * 
	 */
	
	  


}
