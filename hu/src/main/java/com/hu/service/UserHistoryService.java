package com.hu.service;

import java.util.List;

import com.hu.entity.UserHistory;
import com.hu.request.UserHistoryRequest;

public interface UserHistoryService {
	
	UserHistory save(UserHistoryRequest request);
	UserHistory update(UserHistoryRequest request);
	UserHistory findById(int id);
	String delete(int id);
	List<UserHistory> getAll();
	List<UserHistory> findByState(String state);
	
	
	

}
