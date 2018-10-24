package com.techlab.adapterpattern;

public class MediaAdapter implements MediaPlayer {
	AdvanceMediaPlayer advanceMediaPlayer;

	public MediaAdapter(String audioType) {
		if (audioType.equalsIgnoreCase("vlc")) {
			advanceMediaPlayer = new VLCPlayer();
		} else if (audioType.equalsIgnoreCase("mp4")) {
			advanceMediaPlayer = new MP4Player();
		}
	}

	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("vlc")) {
			advanceMediaPlayer.playVLC(fileName);
		} else if (audioType.equalsIgnoreCase("mp4")) {
			advanceMediaPlayer.playMP4(fileName);
		}
	}

}
