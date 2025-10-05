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
	
	public String verificar(Carta c1, Carta c2, Carta c3, Carta c4, Carta c5) {
        List<Carta> cartas = Arrays.asList(c1, c2, c3, c4, c5);
        
        Map<Integer, Integer> contador = new HashMap<>();
        Set<String> palos = new HashSet<String>();
        
        for (Carta c : cartas) {
            int valor = c.getValor();
            String palo = c.getPalo();
            contador.put(valor, contador.getOrDefault(valor, 0) + 1);
            palos.add(palo);
        }
        
       if (contador.values().stream().anyMatch(cant -> cant == 4)) {
    	   return "Poker";
       }
       if (palos.size() == 1) { 
    	   return "Color";
       }
       if (contador.values().stream().anyMatch(count -> count == 3)) {
    	   return "Trio";
       }
       
       return "Nada";
    }
	
}
