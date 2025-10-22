package ar.edu.unq.po2.TemplateAdapter.test;
import ar.edu.unq.po2.TemplateAdapter.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FiltroMLITest {

	private FiltroMLI filtro;
	private WikipediaPage p1;
	private WikipediaPage p2;
	private WikipediaPage p3;
	private WikipediaPage p4;
	private List<WikipediaPage> wikipedia;
	
	
	@BeforeEach
	void setUp() {
		this.filtro = new FiltroMLI();
		
		this.p1 = mock(WikipediaPage.class);
		// pedos jaja
		this.p2 = mock(WikipediaPage.class);
		this.p3 = mock(WikipediaPage.class);
		this.p4 = mock(WikipediaPage.class);
		this.wikipedia = List.of(p2,p3,p4);
	}
	
	@Test
	void testDosPaginasConB() {
		when(p1.getTitle()).thenReturn("Bernal");
		when(p2.getTitle()).thenReturn("Bernal");
		when(p3.getTitle()).thenReturn("Quilmes");
		when(p4.getTitle()).thenReturn("Buenos Aires");
		
		List<WikipediaPage> resultTitles = filtro.getSimilarPages(p1, wikipedia); 
		
		assertTrue(resultTitles.size() == 2);
		assertTrue(resultTitles.contains(p2));
		assertTrue(resultTitles.contains(p4));
	}
	
	@Test
	void testUnaPaginasConB() {
		when(p1.getTitle()).thenReturn("Bernal");
		when(p2.getTitle()).thenReturn("Villa Dominico");
		when(p3.getTitle()).thenReturn("Quilmes");
		when(p4.getTitle()).thenReturn("Buenos Aires");
		
		List<WikipediaPage> resultTitles = filtro.getSimilarPages(p1, wikipedia); 
		
		assertTrue(resultTitles.size() == 1);
		assertTrue(resultTitles.contains(p4));
	}
	
	@Test
	void testNingunaPaginaConB() {
		when(p1.getTitle()).thenReturn("Bernal");
		when(p2.getTitle()).thenReturn("Villa Dominico");
		when(p3.getTitle()).thenReturn("Quilmes");
		when(p4.getTitle()).thenReturn("Lugano");
		
		List<WikipediaPage> resultTitles = filtro.getSimilarPages(p1, wikipedia); 
		
		assertTrue(resultTitles.size() == 0);
	}

}