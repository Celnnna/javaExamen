package com.hu.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hu.entity.UserHistory;
import com.hu.repository.UserHistoryRepository;
import com.hu.request.UserHistoryRequest;
import com.hu.service.UserHistoryService;

@Service
public class UserHistoryLogic implements UserHistoryService{

	@Autowired
	UserHistoryRepository dao;
	
	
	@Override
	public UserHistory save(UserHistoryRequest request) {
		
		UserHistory hu = new UserHistory();
		hu.setDescription(request.getDescription());
		hu.setStartDate(request.getStartDate());
		hu.setEndDate(request.getEndDate());
		hu.setFinished(request.getFinished());
		hu.setStatus(request.getStatus());
		
		dao.save(hu);
		
		return hu;
	}

	@Override
	public UserHistory update(UserHistoryRequest request) {
		UserHistory hu = dao.findById(request.getHistoryId()).get();
		hu.setDescription(request.getDescription());
		hu.setStartDate(request.getStartDate());
		hu.setEndDate(request.getEndDate());
		hu.setFinished(request.getFinished());
		hu.setStatus(request.getStatus());
		
		dao.save(hu);
		
		return hu;
	}

	@Override
	public UserHistory findById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public String delete(int id) {
		dao.deleteById(id);
		return "Eliminado";
	}

	@Override
	public List<UserHistory> getAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public List<UserHistory> findByState(String state) {
		return dao.findByState(state);
	}

}
