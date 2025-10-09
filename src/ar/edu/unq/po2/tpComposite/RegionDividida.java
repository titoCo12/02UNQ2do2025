package ar.edu.unq.po2.tpComposite;

import java.util.ArrayList;

public class RegionDividida implements RegionCultivo{

	private ArrayList<RegionCultivo> cultivos;
	
	public Double gananciaAnual() {
		Double total = 0.0;
		for (RegionCultivo c : cultivos) {
			total += c.gananciaAnual();
		}
		return total / 4;
	}
	
}
