package ar.edu.unq.po2.TemplateAdapter.test;
import ar.edu.unq.po2.TemplateAdapter.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FiltroLECTest {

	private FiltroLEC filtro;
	private WikipediaPage p1;
	private WikipediaPage p2;
	private WikipediaPage p3;
	private WikipediaPage p4;
	private List<WikipediaPage> wikipedia;
	
	
	@BeforeEach
	void setUp() {
		this.filtro = new FiltroLEC();
		
		this.p1 = mock(WikipediaPage.class);
		this.p2 = mock(WikipediaPage.class);
		this.p3 = mock(WikipediaPage.class);
		this.p4 = mock(WikipediaPage.class);
		this.wikipedia = List.of(p2,p3,p4);
	}
	
	@Test
	void testDosPaginasSimilares() {
		when(p1.getLinks()).thenReturn(List.of(p3,p4));
		when(p2.getLinks()).thenReturn(List.of(p4));
		when(p3.getLinks()).thenReturn(List.of(p1));
		when(p4.getLinks()).thenReturn(List.of(p3));
		
		List<WikipediaPage> resultTitles = filtro.getSimilarPages(p1, wikipedia); 
		
		assertTrue(resultTitles.size() == 2);
		assertTrue(resultTitles.contains(p2));
		assertTrue(resultTitles.contains(p4));
	}
	
	@Test
	void testUnaPaginaSimilar() {
		when(p1.getLinks()).thenReturn(List.of(p3,p4));
		when(p2.getLinks()).thenReturn(List.of(p4,p3));
		when(p3.getLinks()).thenReturn(List.of(p2));
		when(p4.getLinks()).thenReturn(List.of(p1));
		
		List<WikipediaPage> resultTitles = filtro.getSimilarPages(p1, wikipedia); 
		
		assertTrue(resultTitles.size() == 1);
		assertTrue(resultTitles.contains(p2));
	}
	
	@Test
	void testNingunaPaginaSimilar() {
		when(p1.getLinks()).thenReturn(List.of(p3,p4));
		when(p2.getLinks()).thenReturn(List.of(p1));
		when(p3.getLinks()).thenReturn(List.of(p2));
		when(p4.getLinks()).thenReturn(List.of(p1));
		
		List<WikipediaPage> resultTitles = filtro.getSimilarPages(p1, wikipedia); 
		
		assertTrue(resultTitles.size() == 0);
	}

}