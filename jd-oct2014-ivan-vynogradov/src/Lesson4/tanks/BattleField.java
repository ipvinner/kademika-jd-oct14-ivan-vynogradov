package Lesson4.tanks;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Arrays;

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
		String result = battleField[v - 1][h - 1];
		return result;

	}

	public void updateQadrant(int v, int h, String field) {
		battleField[v - 1][h - 1] = field;

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
