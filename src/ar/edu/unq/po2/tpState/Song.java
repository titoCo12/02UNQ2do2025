package ar.edu.unq.po2.tpState;

public class Song {

	private MP3State state;
	
	public Song() {
		this.state = new SelectionState(this);
	}
	
	public MP3State getState() {
		return this.state;
	}
	
	public void setState(MP3State newstate) {
		this.state = newstate;
	}
	
	public void play() {
		this.state.play();
	}
	
	public void pause() {
		this.state.pause();
	}
	
	public void stop() {
		this.state.stop();
	}
	
	
}
