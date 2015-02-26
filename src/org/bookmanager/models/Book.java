package org.bookmanager.models;

public class Book
{

	private String title;
	private String isbn;

	public void setTitle(final String object)
	{
		this.title = object;

	}

	public String getTitle()
	{
		return title;
	}

	public void setIsbn(final String isbn)
	{
		this.isbn = isbn;

	}

	public String getIsbn()
	{
		return isbn;
	}


}
