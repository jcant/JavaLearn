package com.gmail.gm.jcant;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String answer = "";

		// building parameters:
		int floors = 9;
		int entrances = 4;
		int floorFlats = 4; // flats in one floor

		int allFlats = entrances * floors * floorFlats; // all flats in building
		int entranceFlats = floors * floorFlats; // flats in entrance

		// User flat parameters:
		int userFlat;
		int userEntrance;
		int userFloor;

		System.out.println("Enter flat number, please:");
		userFlat = sc.nextInt();

		// Processing:
		if ((userFlat > 0) && (userFlat <= allFlats)) {

			//Here we calculate entrance number (first is 0 like array addresses)
			userEntrance = (userFlat - 1) / entranceFlats;
			
			//Here we calculate floor number (first is 0 like array addresses)
			userFloor = ((userFlat - 1) - userEntrance * entranceFlats) / floorFlats;

			//Here we changes founded values to human familiar values
			userEntrance += 1;
			userFloor += 1;

			answer = "Your flat is in " + userEntrance + " entrance, and on " + userFloor + " floor";

		} else {

			answer = "Flat number is incorrect!";

		}

		System.out.println(answer);

		sc.close();

	}

}
