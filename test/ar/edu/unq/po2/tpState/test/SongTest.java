package ar.edu.unq.po2.tpState.test;
import ar.edu.unq.po2.tpState.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SongTest {

	private Song song;
	
	@BeforeEach
	void SetUp() {
		song = new Song();
	}
	
	
	// Estado inicial tiene que ser el de seleccion
	@Test
	void testInicio() {
		assertTrue(song.getState() instanceof SelectionState);
	}
	
	// SelectionState
	
	@Test
	void testSelectionPlay() {
		song.play();
		assertTrue(song.getState() instanceof PlayingState);
	}
	
	@Test
	void testSelectionPause() {
		Exception exc = assertThrows(IllegalStateException.class, () -> song.pause());
		
		assertEquals("No hay nada que pausar", exc.getMessage());
	}
	
	@Test
	void testSelectionStop() {
		//no pasa nada
		song.stop();
		assertTrue(song.getState() instanceof SelectionState);
	}
	
	
	//PlayingState
	@Test
	void testPlayingPlay() {
		song.setState(new PlayingState(song));
		Exception exc = assertThrows(IllegalStateException.class, () -> song.play());
		
		assertEquals("Ya se esta reproduciendo la cancion", exc.getMessage());
	}
	
	@Test
	void testPlayingPause() {
		song.setState(new PlayingState(song));
		
		song.pause();
		
		assertTrue(song.getState() instanceof PausedState);
	}

	@Test
	void testPlayingStop() {
		song.setState(new PlayingState(song));
		
		song.stop();
		
		assertTrue(song.getState() instanceof SelectionState);
	}
	
	//PausedState
	@Test
	void testPausedPlay() {
		song.setState(new PausedState(song));
		
		Exception exc = assertThrows(IllegalStateException.class, () -> song.play());
		
		assertEquals("Cancion ya elegida", exc.getMessage());
	}
	
	@Test
	void testPausedPause() {
		song.setState(new PausedState(song));
		
		song.pause();
		
		assertTrue(song.getState() instanceof PlayingState);
	}
	
	@Test
	void testPausedStop() {
		song.setState(new PausedState(song));
		
		song.stop();
		
		assertTrue(song.getState() instanceof SelectionState);
	}
	
	
}
