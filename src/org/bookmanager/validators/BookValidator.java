package org.bookmanager.validators;

import org.apache.commons.lang.StringUtils;
import org.bookmanager.models.Book;


/**
 * @author yeljaoujat
 */
public class BookValidator
{

	public boolean validate(final Book book)
	{
		return validateTitle(book) && validateIsbn(book);
	}

	/**
	 * @param book
	 * @return
	 */
	private boolean validateTitle(final Book book)
	{
		return false;//StringUtils.isNotEmpty(book.getTitle());
	}

	/**
	 * @param book
	 * @return
	 */
	private boolean validateIsbn(final Book book)
	{
		return StringUtils.isNotEmpty(book.getIsbn());
	}


}
