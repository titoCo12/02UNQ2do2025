package ar.edu.unq.po2.TemplateAdapter;

import java.util.List;

public class FiltroMLI implements Filtro{

	public List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia) {
		char letra = page.getTitle().charAt(0);
		return wikipedia.stream().filter(p -> p.getTitle().charAt(0) == letra).toList();
	}
	
}
