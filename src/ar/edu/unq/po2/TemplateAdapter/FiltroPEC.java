package ar.edu.unq.po2.TemplateAdapter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FiltroPEC implements Filtro{

	public List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia) {
		Set<String> props = page.getInfobox().keySet();
	    return wikipedia.stream().filter(p -> p.getInfobox().keySet().stream().anyMatch(props::contains)).collect(Collectors.toList());
	}
	
}
