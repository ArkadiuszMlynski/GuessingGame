package pl.projekt;

public class TrashTalk {
private String[]trashTalks = new String[3];

public String getTrashTalks(int number) {
	trashTalks[0]="You suck!";
	trashTalks[1]="You're going down!";
	trashTalks[2]="What a loser";
	return trashTalks[number];
	}
}
