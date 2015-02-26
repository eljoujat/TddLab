package org.bookmanager.validators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.bookmanager.models.Book;
import org.junit.Test;


public class BookValidatorTest
{

	@Test
	public void titleShouldNotBeNull()
	{

		//GIVEN
		final BookValidator bookValidator = new BookValidator();
		final Book book = createValidBook();
		book.setTitle(null);

		//WHEN
		final boolean isValid = bookValidator.validate(book);


		//THEN
		assertFalse(isValid);

	}


	@Test
	public void notEmptyTitleShouldBeValid()
	{

		//GIVEN
		final BookValidator bookValidator = new BookValidator();
		final Book book = createValidBook();
		//WHEN
		final boolean isValid = bookValidator.validate(book);

		//THEN
		assertTrue(isValid);

	}

	@Test
	public void isbnShouldNotBeEmpty()
	{

		//GIVEN
		final Book book = createValidBook();
		final BookValidator bookValidator = new BookValidator();

		//WHEN
		final boolean isValid = bookValidator.validate(book);

		//THEN
		assertTrue(isValid);

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

	private Book createValidBook()
	{
		final Book validBook = new Book();

		validBook.setIsbn("isbn_1");
		validBook.setTitle("validTitle");

		return validBook;
	}

}
