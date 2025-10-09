package ar.edu.unq.po2.tptdd;
import java.util.*;


public class PokerStatus {
    
	/*  
          Version punto 1)
    
    public boolean verificar(String c1, String c2, String c3, String c4, String c5) {
        List<String> cartas = Arrays.asList(c1, c2, c3, c4, c5);
        
        Map<String, Integer> contador = new HashMap<>();
        
        for (String carta : cartas) {
            String valor = carta.substring(0, carta.length() - 1);
            contador.put(valor, contador.getOrDefault(valor, 0) + 1);
        }
        
        return contador.values().stream().anyMatch(count -> count == 4);
    }
    */
	
	public Jugada verificar(Carta c1, Carta c2, Carta c3, Carta c4, Carta c5) {
        List<Carta> cartas = Arrays.asList(c1, c2, c3, c4, c5);
        
        Map<ValorCarta, Integer> contador = new HashMap<>();
        Set<PaloCarta> palos = new HashSet<PaloCarta>();
        int valorTotal = 0;
        
        for (Carta c : cartas) {
        	ValorCarta valor = c.getValor();
            contador.put(valor, contador.getOrDefault(valor, 0) + 1);
            valorTotal += valor.ordinal();
            palos.add(c.getPalo());
        }
        
       if (contador.values().stream().anyMatch(cant -> cant == 4)) {
    	   return new Jugada(valorTotal, TipoMano.POKER);
       }
       if (palos.size() == 1) { 
    	   return new Jugada(valorTotal, TipoMano.COLOR);
       }
       if (contador.values().stream().anyMatch(count -> count == 3)) {
    	   return new Jugada(valorTotal, TipoMano.TRIO);
       }
       
       return new Jugada(valorTotal, TipoMano.NADA);
    }
	
}
