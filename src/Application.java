import java.util.LinkedHashSet;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {
		
		//sets are good for groups of things where you want to 
		//eliminate duplicates (see below)
		
		Set<String> set1 = new HashSet<String>();
		
		if(set1.isEmpty()){
			System.out.println("The set is empty.");
		}

		set1.add("dog");
		set1.add("cat");
		set1.add("bird");
		set1.add("snake");
		set1.add("mouse");
		
		//adding duplicate items:
		//does nothing. watch.
		set1.add("bird");
		
		System.out.println(set1);
		//remember that HashSet doesn't sort in any particular order
		
		//LinkedHashSet on the other hand...
		//sorts in order entered.
		Set<String> set2 = new LinkedHashSet<String>();

		set2.add("dog");
		set2.add("cat");
		set2.add("bird");
		set2.add("snake");
		set2.add("mouse");
		System.out.println(set2);
		
		//and finally, TreeSet
		//sorts in natural order.
		Set<String> set3 = new TreeSet<String>();

		set3.add("dog");
		set3.add("cat");
		set3.add("bird");
		set3.add("snake");
		set3.add("mouse");
		System.out.println(set3);
		
		for (String element: set1){
			System.out.println(element);
		}
		
		//how to find a particular item in a set:
		if (set1.contains("frog")){
			System.out.println("Contains frog.");
		}
		
		if (set1.contains("cat")){
			System.out.println("Contains cat.");
		}
		
		//intersections:
		//let's compare set1 to set4
		
		Set<String> set4 = new TreeSet<String>();

		set4.add("dog");
		set4.add("cat");
		set4.add("ant");
		set4.add("bird");
		set4.add("fox");


		Set<String> intersection = new HashSet<String>(set1);
		//that just makes a copy of set1 called intersection
		System.out.println(intersection);
		
		//this compares the two sets, and retains only those in both
		intersection.retainAll(set4);
		System.out.println(intersection); //prints 3 of 5 animals, common to both sets
		
		//differences between sets:
		Set<String> difference = new HashSet<String>(set1);
		//this makes a copy of set1
		System.out.println(difference);
		
		//this compares the two sets and retains only
		//items unique to set1
		difference.removeAll(set4);
		System.out.println(difference); //prints 2 of 5, that are unique
	}

	//you can find all sorts of methods for Sets on the web.
	
	//note that Sets are not Arrays, but I don't know the difference.
}
