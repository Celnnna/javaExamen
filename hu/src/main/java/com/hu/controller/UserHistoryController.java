package com.hu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hu.entity.UserHistory;
import com.hu.logic.UserHistoryLogic;
import com.hu.request.UserHistoryRequest;

@RestController
@RequestMapping("user-history/")
public class UserHistoryController {

	@Autowired
	UserHistoryLogic service;

	@GetMapping("listar")
	public ResponseEntity<List<UserHistory>> listar() {
		Integer variable = 234234;
		List<UserHistory> list = service.getAll();
		return new ResponseEntity<List<UserHistory>>(list, HttpStatus.OK);
	}

	@PostMapping("guardar")
	public ResponseEntity<UserHistory> guardar(@RequestBody UserHistoryRequest request) {
		UserHistory UserHistory = service.save(request);
		return new ResponseEntity<UserHistory>(UserHistory, HttpStatus.OK);
	}

	@PutMapping("editar")
	public ResponseEntity<UserHistory> editar(@RequestBody UserHistoryRequest request) {
		UserHistory UserHistory = service.update(request);
		return new ResponseEntity<UserHistory>(UserHistory, HttpStatus.OK);
	}

	@DeleteMapping("eliminar/{id}")
	public ResponseEntity<String> eliminar(@PathVariable int id) {
		String response = service.delete(id);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}

	@GetMapping("buscar-por-id/{id}")
	public ResponseEntity<UserHistory> buscar(@PathVariable int id) {
		UserHistory UserHistory = service.findById(id);
		return new ResponseEntity<UserHistory>(UserHistory, HttpStatus.OK);
	}

	@GetMapping("buscar-por-status/{status}")
	public ResponseEntity<List<UserHistory>> buscarPorstatus(@PathVariable String status) {
		List<UserHistory> UserHistory = service.findByState(status);
		return new ResponseEntity<List<UserHistory>>(UserHistory, HttpStatus.OK);
	}

}
