package ar.edu.unq.po2.TemplateAdapter;

import java.util.List;

/*
Esta todo Mal!!!!! No deberia ser interfaz deberia ser clase abstractca y todos los metodos
 Deberian seguir el patron de iterar por cada pagina en wikipedia y ver si "esSimilar()" 
 que seria el metodo hook. (estaba muy cansado cuando lo hice diablo)
*/

public interface Filtro {

	public List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia); 
	
}
