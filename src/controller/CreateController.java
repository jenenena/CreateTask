package controller;

import java.util.ArrayList;
import view.CreateFrame;

public class CreateController
{
	ArrayList<String> songList = new ArrayList<String>();
	private CreateFrame appFrame;
	
	
	public CreateController()
	{
		appFrame = new CreateFrame(this);
	}
	
	public void start()
	{
		
		songList.add("Dice by Puzzle");
		songList.add("Valentine's Curse by Bane's World");
		songList.add("Favorite Hat by Pity Party (Girls Club)");
		songList.add("Feel Your Weight by Rhye");
		songList.add("Fazon by Sopwith Camel");
		songList.add("Como Te Vas by Trails and Ways");
		songList.add("We Close Our Eyes by Oingo Boingo");
		songList.add("You Would Have to Lose Your Mind by The Barr Brothers");
		songList.add("Clover by Joywave");
		songList.add("Another Night by Real McCoy");
		songList.add("No Rain by Blind Melon");
		songList.add("Holding On To You by Twenty One Pilots");
		songList.add("You Doubt by Parks, Squares and Alleys");
		songList.add("High and Dry by Radiohead");
		songList.add("Fading Into You by Mazzy Star");
		songList.add("Island In The Sun by Weezer");
		songList.add("Break My Stride by Matthew Wilder");
		songList.add("Garden Grays by Wildcat! Wildcat!");
		songList.add("Saturday Night by The Bobby Fuller Four");
		songList.add("Shark Attack by Grouplove");
		songList.add("New York City by Current Joys");
		songList.add("Good Vibrations by The Beach Boys");
		songList.add("Wicked Game by Chris Isaak");
		songList.add("Pumped Up Kicks by Foster The People");
		songList.add("Northern Lights by Death Cab for Cutie");
		songList.add("What You Know by Two Door Cinema Club");
		songList.add("Sea of Air by Portugal. The Man");
	}
	
	public String findSong()
	{
		int index = (int)(Math.random() * 27);
		String currentSong = songList.get(index);
		return currentSong;
	}
}
