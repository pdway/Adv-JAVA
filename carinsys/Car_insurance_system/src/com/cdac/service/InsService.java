package com.cdac.service;
import com.cdac.dto.Ins;
import java.util.List;
public interface InsService {


	void addIns(Ins ins);
	List<Ins> selectAll();
	void removeIns(String insNo);
	void modifyIns(Ins ins);
	Ins findIns(String insNo);
	
}
