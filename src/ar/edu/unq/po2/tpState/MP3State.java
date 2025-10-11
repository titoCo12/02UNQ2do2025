package ar.edu.unq.po2.tpState;

public class MP3State {

	private Song song;
	
	public MP3State(Song song) {
		this.song = song;
	}
	
	public void play() {}
	public void pause() {}
	public void stop() {}
	
	public Song getSong() {
		return this.song;
	}
}
