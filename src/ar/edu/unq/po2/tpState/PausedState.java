package ar.edu.unq.po2.tpState;

public class PausedState extends MP3State{

	public PausedState(Song song) {
		super(song);
	}
	
	public void play() {
		throw new IllegalStateException("Cancion ya elegida");
	}
	
	public void pause() {
		Song song = this.getSong();
		song.setState(new PlayingState(song));
	}
	
	public void stop() {
		Song song = this.getSong();
		song.setState(new SelectionState(song));
	}
	
}
