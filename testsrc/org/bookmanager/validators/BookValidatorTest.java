package org.bookmanager.validators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.bookmanager.models.Book;
import org.junit.Test;


public class BookValidatorTest
{

	@Test
	public void titleShouldNotBeNull()
	{

		//GIVEN
		final BookValidator bookValidator = new BookValidator();
		final Book book = new Book();
		book.setTitle(null);

		//WHEN
		final boolean isValid = bookValidator.validate(book);


		//THEN
		assertFalse(isValid);

	}



	@Test
	public void titleShouldBeSaved()
	{

		//GIVEN
		final String title = "";
		final Book book = new Book();

		//WHEN
		book.setTitle(title);


		//THEN
		assertEquals(title, book.getTitle());

	}
}
