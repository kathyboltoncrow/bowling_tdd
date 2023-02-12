package com.techreturners;

public class BowlingGame {

   int [] rolls = new int[21];

    public int[] loadGame(String input) {
        int rollsIndex = 0;

        for (int i = 0; i < input.length(); i++) {
            char roll = input.charAt(i);
            if (roll >= '1' && roll <= '9') {
                rolls[rollsIndex] = Integer.parseInt(String.valueOf(roll));
                rollsIndex++;
            } else if (roll == '-') {
                rolls[rollsIndex] = 0;
                rollsIndex++;
            } else if (roll == 'X') {
                rolls[rollsIndex] = 10;
                rollsIndex++;
            } else if (roll == '/') {
                rolls[rollsIndex] = 10 - rolls[rollsIndex - 1];
                rollsIndex++;
            }

        }
        return rolls;
    }


    }
