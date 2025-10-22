package ar.edu.unq.po2.TemplateAdapter.test;
import ar.edu.unq.po2.TemplateAdapter.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FiltroPECTest {

	private FiltroPEC filtro;
	private WikipediaPage p1;
	private WikipediaPage p2;
	private WikipediaPage p3;
	private WikipediaPage p4;
	private List<WikipediaPage> wikipedia;
	
	
	@BeforeEach
	void setUp() {
		this.filtro = new FiltroPEC();
		
		this.p1 = mock(WikipediaPage.class);
		this.p2 = mock(WikipediaPage.class);
		this.p3 = mock(WikipediaPage.class);
		this.p4 = mock(WikipediaPage.class);
		this.wikipedia = List.of(p2,p3,p4);
	}
	
	@Test
	void testDosPaginasSimilares() {
		when(p1.getInfobox()).thenReturn(Map.of("Bernal", p2, "Quilmes", p3));
		when(p2.getInfobox()).thenReturn(Map.of("Bernal", p3, "Lugano", p4));
		when(p3.getInfobox()).thenReturn(Map.of("Wilde" , p2));
		when(p4.getInfobox()).thenReturn(Map.of("Quilmes", p3, "Bernal", p2));
		
		List<WikipediaPage> resultTitles = filtro.getSimilarPages(p1, wikipedia); 
		
		assertTrue(resultTitles.size() == 2);
		assertTrue(resultTitles.contains(p2));
		assertTrue(resultTitles.contains(p4));
	}
	
	@Test
	void testUnaPaginasSimilar() {
		when(p1.getInfobox()).thenReturn(Map.of("Bernal", p2, "Quilmes", p3));
		when(p2.getInfobox()).thenReturn(Map.of("Buenos Aires", p3, "Lugano", p4));
		when(p3.getInfobox()).thenReturn(Map.of("Wilde" , p2));
		when(p4.getInfobox()).thenReturn(Map.of("Quilmes", p3, "Bernal", p2));
		
		List<WikipediaPage> resultTitles = filtro.getSimilarPages(p1, wikipedia); 
		
		assertTrue(resultTitles.size() == 1);
		assertTrue(resultTitles.contains(p4));
	}
	
	@Test
	void testNingunaPaginaSimilar() {
		when(p1.getInfobox()).thenReturn(Map.of("Bernal", p2, "Quilmes", p3));
		when(p2.getInfobox()).thenReturn(Map.of("Buenos Aires", p3, "Lugano", p4));
		when(p3.getInfobox()).thenReturn(Map.of("Wilde" , p2));
		when(p4.getInfobox()).thenReturn(Map.of("Varela", p3, "Quito", p2));
		
		List<WikipediaPage> resultTitles = filtro.getSimilarPages(p1, wikipedia); 
		
		assertTrue(resultTitles.size() == 0);
	}

}