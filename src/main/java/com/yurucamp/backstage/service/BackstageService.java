package com.yurucamp.backstage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yurucamp.backstage.dao.BackstageDao;
import com.yurucamp.backstage.model.Test;

@Service
public class BackstageService {
	
	@Autowired
	BackstageDao backstageDao;
    
    
    @Transactional
	public List<Test> getAllProducts() {
		return backstageDao.getAllProducts();
	}
    
	
}
