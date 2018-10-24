package com.techlab.adapterpatterntest;

import com.techlab.adapterpattern.AudioPlayer;

public class Test {

	public static void main(String[] args) {
		AudioPlayer audioPlayer=new AudioPlayer();
		audioPlayer.play("mp4", "whatever");
		audioPlayer.play("vlc", "asassas");
		audioPlayer.play("mp3", "asa");
		audioPlayer.play("asa", "lkl");
	}
}
