package ar.edu.unq.po2.TemplateAdapter;

import java.util.List;
import java.util.Map;

public class WikipediaPage {

	private String title;
	private List<WikipediaPage> links;
	private Map<String, WikipediaPage> infoBox;
	
	public WikipediaPage(String title, List<WikipediaPage> links, Map<String, WikipediaPage> infoBox) {
		this.title = title;
		this.links = links;
		this.infoBox = infoBox;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public List<WikipediaPage> getLinks() {
		return this.links;
	}
	
	public Map<String, WikipediaPage> getInfobox() {
		return this.infoBox;
	}
	
	
	
}
