package ar.edu.unq.po2.tpState;

public class PlayingState extends MP3State{

	public PlayingState(Song song) {
		super(song);
	}
	
	public void play() {
		throw new IllegalStateException("Ya se esta reproduciendo la cancion");
	}
	
	public void pause() {
		Song song = this.getSong();
		song.setState(new PausedState(song));
	}
	
	public void stop() {
		Song song = this.getSong();
		song.setState(new SelectionState(song));
	}
	
}
