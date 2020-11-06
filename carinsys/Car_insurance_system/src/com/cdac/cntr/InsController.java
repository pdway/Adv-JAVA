package com.cdac.cntr;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.dto.Ins;
import com.cdac.service.InsService;
import java.util.List;

@Controller
public class InsController {

	@Autowired
	private InsService insService;
	
	@RequestMapping(value = "/prep_add_ins_form1.htm",method = RequestMethod.GET)
	public String prepRegForm1(ModelMap map) {
		map.put("ins", new Ins());
		return "addins";
	}
	
	@RequestMapping(value = "/add_ins.htm",method = RequestMethod.POST)
	public String register(Ins ins,ModelMap map) {
		insService.addIns(ins);
		return "inspage";
	}
	
	@RequestMapping(value="/ins_list.htm",method = RequestMethod.GET)
	public String showcourse(ModelMap map) {
		List<Ins> li=insService.selectAll();
		
		map.put("insList", li);
		
		return "inslist";
	}
	
	@RequestMapping(value = "/ins_delete.htm",method = RequestMethod.GET)
	public String userDelete(@RequestParam String insNo,ModelMap map,HttpSession session) {
		
		insService.removeIns(insNo); 
		
		
		List<Ins> li = insService.selectAll();
		map.put("insList", li);
		return "inslist";
	}
	
	@RequestMapping(value = "/ins_update_form.htm",method = RequestMethod.GET)
	public String userUpdateForm(@RequestParam String insNo,ModelMap map) {
		
		Ins exp = insService.findIns(insNo);
		map.put("ins", exp);
		
		return "ins_update_form";
	}
	
	
	@RequestMapping(value = "/ins_update.htm",method = RequestMethod.POST)
	public String expenseUpdate(Ins ins,ModelMap map,HttpSession session) {
		
		
		insService.modifyIns(ins);
			
		List<Ins> li = insService.selectAll();
		map.put("insList", li);
		return "inslist";
	}
	
	
	
}