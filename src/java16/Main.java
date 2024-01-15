package java16;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String>names = new ArrayList<String>();
		names.add("佐々木");
		names.add("田中");
		names.add("佐伯");
		
		names.set(1, "中田");
		names.remove(0);
		
		System.out.println(names.size()+"個");  //sizeで要素の個数
		System.out.println(names.get(1)); //getでaddの要素を受け取る
		
		for(String name:names) {
			System.out.println(name);
		}
	}

}

