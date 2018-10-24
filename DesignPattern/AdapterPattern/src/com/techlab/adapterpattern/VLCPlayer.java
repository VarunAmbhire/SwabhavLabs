package com.techlab.adapterpattern;

public class VLCPlayer implements AdvanceMediaPlayer {

	@Override
	public void playVLC(String fileName) {
		System.out.println("Playing Media Player in VLC Player " + fileName);
	}

	@Override
	public void playMP4(String fileName) {
		// TODO Auto-generated method stub

	}

}
