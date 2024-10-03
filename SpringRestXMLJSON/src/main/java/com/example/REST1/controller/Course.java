package com.example.REST1.controller;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

//import jakarta.xml.bind.annotation.XmlRootElement;
//


//@XmlRootElement
@JacksonXmlRootElement
public class Course {

	private Integer cid;
	private String cname;
	private Double price;
	public Course() {
		super();
	}
	
	
	public Course(Integer cid, String cname, Double price) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.price = price;
	}


	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", price=" + price + "]";
	}
	
	
}
