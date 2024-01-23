package com.casino.andarbahar1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class AndarBaharGame {
	
	private ArrayList<Integer>andarCard=new ArrayList<>();
	private ArrayList<Integer>baharCard=new ArrayList<>();
	private Map<Integer, Integer>availableCards=new HashMap<Integer, Integer>();
	private int winnerSide;  //0 for andar, 1 for bahar
	private int joker;
	private int reward;

 public void startGame() {
	 
	 for(int i=1;i<=9;i++)
	 {
		 availableCards.put(i,4);
	 }
	 
	 andarCard.clear();
	 baharCard.clear();
	 
	 joker=drawCard();
	 
	 int currentCard=0;
	 boolean turn=true;
	 
	 while(currentCard!=joker)
	 {
		 currentCard=drawCard();
		 if(turn)
			 andarCard.add(currentCard);
		 else
			 baharCard.add(currentCard);
		 
		 turn=!turn;
	 }
	 
	 if(turn==false)
		 winnerSide=0;
	 else
		 winnerSide=1;
		 
 }

 public int getReward() {
	return reward;
}

public ArrayList<Integer> getAndarCard() {
     return andarCard;
 }

 public ArrayList<Integer> getBaharCard() {
     return baharCard;
 }

 public int getJoker() {
	return joker;
}

public String determineWinner(int chosenSide, int betAmount) {
     
     if(chosenSide==winnerSide)
     {
    	 reward=2*betAmount;
    	 return "Winner";
     }
     else
     {
    	 reward=0;
    	 return "Lost";
     }
 }

 private int drawCard() {
     int randomKey=getRandomKey(availableCards);
     
     int currentCount=availableCards.get(randomKey);
     int updatedCount=currentCount-1;
     
     if (updatedCount == 0) {
         // Remove the key if the updated value is 0
         availableCards.remove(randomKey);
     } else {
         // Update the value in the HashMap
    	 availableCards.put(randomKey, updatedCount);
     }
     
     return randomKey;
 }
 
 private static Integer getRandomKey(Map<Integer, Integer> mp) {

     // Get a random index
     int randomIndex = new Random().nextInt(mp.size());
     
     Integer i=0;
     for(Integer key:mp.keySet())
     {
    	 if(i==randomIndex)
    		 return key;

    	 i++;
     }
     return i;
 }

}
