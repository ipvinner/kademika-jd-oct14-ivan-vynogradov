package Lesson6.tanks;

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
			{ "B", "B", "B", " ", "B", " ", "B", "B", "B" },
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
	public String scanQadrant(int v, int h) {
//		String result = battleField[v - 1][h - 1]; my variant
		String result = battleField[v][h]; // Oleg video
		return result;

	}

	public void updateQadrant(int v, int h, String field) {
//		battleField[v - 1][h - 1] = field;
		battleField[v][h] = field;

	}
	
	public String getAggressorLocation(){
		Random r = new Random();
		int i = r.nextInt(3);
		String aggressorLocation;
		
		if(i == 1){
				aggressorLocation = "64_128";
			}else if(i == 2){
				aggressorLocation = "256_320";
			}else {
				aggressorLocation = "0_384";
			}
		return aggressorLocation;
		
	}
	
	public int getDimentionX(){
		return battleField[0].length;
	}
	
	public int getDimentionY(){
		return battleField[0].length;
	}

	public int getBF_WIDTH() {
		return BF_WIDTH;
	}

	public int getBF_HEIGHT() {
		return BF_HEIGHT;
	}
	
	public String[][] getBattleField() {
		return battleField;
	}
	

}
