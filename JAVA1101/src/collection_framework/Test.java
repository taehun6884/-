package collection_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		Set<Integer> myLotto = new TreeSet<Integer>();
//		myLotto.add(Math.round(Math.random()*44)+1);
//		myLotto.add(Math.round(Math.random()*44)+1);
//		myLotto.add(Math.round(Math.random()*44)+1);
//		myLotto.add(Math.round(Math.random()*44)+1);
//		myLotto.add(Math.round(Math.random()*44)+1);
//		myLotto.add(Math.round(Math.random()*44)+1);
		Random random = new Random();
	
		
		System.out.println("로또 번호 : "+myLotto);
		Set<Integer> thisWeekLotto = new TreeSet<Integer>();
		thisWeekLotto.add(7);
		thisWeekLotto.add(8);
		thisWeekLotto.add(11);
		thisWeekLotto.add(13);
		thisWeekLotto.add(15);
		thisWeekLotto.add(23);
		System.out.println(thisWeekLotto);
		
		System.out.println(thisWeekLotto.equals(myLotto));
		
		while(myLotto.size() < 6) {
			myLotto.add(random.nextInt(45)+1);
		}
		int count = 0;
//		Object[] o = myLotto.toArray();
//		Object[] o2 = thisWeekLotto.toArray();
//			for(int i =0; i<o.length;i++ ) {
//				
//				for(int j=0;j<o2.length;j++) {
//					if(o2[j] == o[i]) {
//						count +=1;
//				}
//			}
//		}	
//		System.out.println(count);	
		Iterator<Integer> ite = myLotto.iterator();
		
		while(ite.hasNext()) {
			int num = ite.next();

			if(thisWeekLotto.contains(num)) {
				count++;
			}
		}
		
		System.out.println("=================================");
		
		for(int num : myLotto) {
			
			if(thisWeekLotto.contains(num)) {
				count++;
			}
		}
		System.out.println(count);
		
		switch (count) {
		case 6:
			System.out.println("1등"); break;
		case 5:
			System.out.println("2등"); break;
		case 4:
			System.out.println("3등"); break;	
		case 3:
			System.out.println("4등"); break;	

		default:
			System.out.println("꽝!");
		}
	}
}


