package com.techlab.adapterpattern;

public class MP4Player implements AdvanceMediaPlayer {

	@Override
	public void playVLC(String fileName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void playMP4(String fileName) {
		System.out.println("Playing Media file in MP4 Player " + fileName);
	}

}