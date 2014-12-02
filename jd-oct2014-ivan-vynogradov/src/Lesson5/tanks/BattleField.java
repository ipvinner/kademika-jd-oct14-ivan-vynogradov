package Lesson5.tanks;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class BattleField {

	private int BF_WIDTH = 576;
	private int BF_HEIGHT = 576;

	private String[][] battleField = { { "B", "B", "B", "B", " ", "B", " ", "B", "B" },
			{ "B", " ", " ", " ", " ", " ", " ", " ", "B" },
			{ "B", "B", " ", " ", "B", " ", "B", "B", "B" },
			{ "B", "B", "B", " ", " ", " ", "B", "B", "B" },
			{ "B", "B", "B", " ", "B", " ", "B", "B", "B" },
			{ "B", "B", " ", "B", "B", "B", " ", "B", "B" },
			{ "B", "B", " ", " ", " ", " ", " ", "B", "B" },
			{ "B", " ", " ", "B", "B", "B", " ", " ", "B" },
			{ "B", " ", " ", "B", "B", "B", " ", " ", "B" } };

	public BattleField() {
		
	}
	
	public BattleField(String[][] battlefield){
		this.battleField = battlefield;
	}
	
	public void updateQadrant(int v, int h, String object) {
		battleField[v][h] = object;
	}
	
	public String scanQadrant(int v, int h) {
		return battleField[v][h];
	}
	
	public int getDimentionX(){
		return battleField.length;
	}
	
	public int getDimentionY(){
		return battleField.length;
	}
	
	
	public String getAggressorLocation(){
//		Random r = new Random();
//		int i = r.nextInt(3);
//		String aggressorLocation;
//		
//		if(i == 1){
//				aggressorLocation = "64_128";
//			}else if(i == 2){
//				aggressorLocation = "256_320";
//			}else {
//				aggressorLocation = "0_384";
//			}
//		return aggressorLocation;
		return "64_128";
		
	}

	public int getBF_WIDTH() {
		return BF_WIDTH;
	}

	public int getBF_HEIGHT() {
		return BF_HEIGHT;
	}
	
	
	

}
