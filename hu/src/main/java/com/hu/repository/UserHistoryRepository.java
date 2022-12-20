package com.hu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hu.entity.UserHistory;

@Repository
public interface UserHistoryRepository extends JpaRepository<UserHistory, Integer>{
	
	@Query("SELECT hu FROM UserHistory hu WHERE hu.status = :status")
	List<UserHistory> findByState(@Param("status")String status);

}
