package com.cdac.dto;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Table(name = "ins")
public class Ins {

	@Id
	@Column(name = "Ins_No")
	private String insNo;
	@Column(name = "Provider")
	private String Provider;
	@Column(name = "Ins_Valid_Date")
	private String InsValidDate ;
	@Column(name = "Ins_Holder")
	private String InsHolder ;
	@Column(name = "Lic_no")
	private int licNo;
	public Ins() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ins(String insNo) {
		super();
		this.insNo = insNo;
	}
	public String getInsNo() {
		return insNo;
	}
	public void setInsNo(String insNo) {
		this.insNo = insNo;
	}
	public String getProvider() {
		return Provider;
	}
	public void setProvider(String provider) {
		Provider = provider;
	}
	public String getInsValidDate() {
		return InsValidDate;
	}
	public void setInsValidDate(String insValidDate) {
		InsValidDate = insValidDate;
	}
	public String getInsHolder() {
		return InsHolder;
	}
	public void setInsHolder(String insHolder) {
		InsHolder = insHolder;
	}
	public int getLicNo() {
		return licNo;
	}
	public void setLicNo(int licNo) {
		this.licNo = licNo;
	}
	
	
	
	
	
}
