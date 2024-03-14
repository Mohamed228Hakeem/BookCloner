package com.Prototype;

public class book implements Cloneable{
	private String id;
	private String title;
	private String author;
	
	public book(String id,String title,String author)
	{
		this.setId(id);
		this.setTitle(title);
		this.setAuthor(author);
	}

	public book(book protobook) {
		this.id = protobook.id;
		this.author = protobook.author;
		this.title = protobook.title;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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
	
	public Cloneable clone()
	{
		return new book(this);
	}
}
