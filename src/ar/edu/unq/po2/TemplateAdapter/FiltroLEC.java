package ar.edu.unq.po2.TemplateAdapter;

import java.util.ArrayList;
import java.util.List;

public class FiltroLEC implements Filtro{

	public List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia) {
		List<WikipediaPage> links = page.getLinks();
		List<WikipediaPage> results = new ArrayList<WikipediaPage>();
		for (WikipediaPage p : wikipedia) {
			List<WikipediaPage> ls = p.getLinks();
			if (links.stream().anyMatch(ls::contains)) {
				results.add(p);
			}
		}
		return results;
	}
	
}
