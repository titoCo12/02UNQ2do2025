package ar.edu.unq.po2.tpState;

public class SelectionState extends MP3State{

	public SelectionState(Song song) {
		super(song);
	}
	
	public void play() {
		Song song = this.getSong();
		song.setState(new PlayingState(song));
	}
	
	public void pause() {
		throw new IllegalStateException("No hay nada que pausar");
	}
	
}
