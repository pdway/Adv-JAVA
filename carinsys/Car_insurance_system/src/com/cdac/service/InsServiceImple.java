package com.cdac.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.InsDao;

import com.cdac.dto.Ins;

@Service
public class InsServiceImple implements InsService {

	@Autowired
	private InsDao insDao;
	
	@Override
	public void addIns(Ins ins) {
		
		insDao.insertIns(ins);
	}

	@Override
	public List<Ins> selectAll() {
		return insDao.selectAll();
	}

	@Override
	public void removeIns(String insNo) {
		insDao.deleteIns(insNo);
		
	}

	@Override
	public void modifyIns(Ins ins) {
		insDao.updateIns(ins);
		
	}

	@Override
	public Ins findIns(String insNo) {
		return insDao.selectIns(insNo);
	}

}
