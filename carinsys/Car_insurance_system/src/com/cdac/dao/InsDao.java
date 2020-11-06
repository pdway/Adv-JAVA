package com.cdac.dao;
import com.cdac.dto.Ins;
import java.util.List;
public interface InsDao {

	void insertIns(Ins ins);
	List<Ins> selectAll();
	void deleteIns(String insNo);
	void updateIns(Ins ins);
	Ins selectIns(String insNo);
}
