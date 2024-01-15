package java16;

import java.util.ArrayList;

public class ListMain {

	public static void main(String[] args) {
		
		ArrayList<Human>humans = new ArrayList<Human>();
		for(int i = 0; i<100; i++) {
			Human h = new Human("村人"+i);
			humans.add(h);
		}
		
		Human human = humans.remove(3);
		//rermoveでとりだしてほかの場所（この場合human）にうつせる
		human.intro();
		
	}

}
