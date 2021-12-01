package com.coforge.training.mockitodemo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
class LibraryTest {
	
	@InjectMocks
	Library lib;
	
	@Mock
	Person person;
	
	@Mock
	Books book;
	
	//@BeforeAll
	//static void setUpBeforeClass() throws Exception {
	//}

	@Test
	void testBookIssuedTo() {
		lib = new Library();
		String res = lib.bookIssuedTo();
		//when(person.getName()).thenReturn("Anubhav");
		assertEquals(res,"Rahul");
		
		//verify(book,times(1));
		
	}

}
