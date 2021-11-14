package edu.vinaenter.models;

import java.util.Date;

public class News {

	private int id;
	
	private String title;
	
	private String author;
	
	private Date createdBy;
	
	private String detail;
	
	private int status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Date createdBy) {
		this.createdBy = createdBy;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public News(int id, String title, String author, Date createdBy, String detail, int status) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.createdBy = createdBy;
		this.detail = detail;
		this.status = status;
	}

	public News() {
		super();
	}
}
