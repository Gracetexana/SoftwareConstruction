/*
* Grace Texana Long Torales
* gtl1500@g.rit.edu
*/

package homework;



public class TestMyLists {
	  public static void main(String[] args) {
	    // Create a list
	    MyList<String> arraylist = new MyArrayList<String>();

	    // Add elements to the list
	    arraylist.add("America"); // Add it to the list
	    System.out.println("(1) " + arraylist);

	    arraylist.add(0, "Canada"); // Add it to the beginning of the list
	    System.out.println("(2) " + arraylist);

	    arraylist.add("Russia"); // Add it to the end of the list
	    System.out.println("(3) " + arraylist);

	    arraylist.add("France"); // Add it to the end of the list
	    System.out.println("(4) " + arraylist);

	    arraylist.add(2, "Germany"); // Add it to the list at index 2
	    System.out.println("(5) " + arraylist);

	    arraylist.add(5, "Norway"); // Add it to the list at index 5
	    System.out.println("(6) " + arraylist);

	    // Remove elements from the list
		  arraylist.remove("Canada"); // Same as list.remove(0) in this case
		  System.out.println("(7) " + arraylist);

		  arraylist.remove(2); // Remove the element at index 2
		  System.out.println("(8) " + arraylist);

		  arraylist.remove(arraylist.size() - 1); // Remove the last element
		  System.out.print("(9) " + arraylist + "\n(10) ");

		  for (String s: arraylist)
		  System.out.print(s.toUpperCase() + " ");


	MyList<String> mylinkedlist = new MyLinkedList<>();

		System.out.println();
		System.out.println();
	// Add elements to the list
	    mylinkedlist.add("America"); // Add it to the list
	    System.out.println("(1) " + mylinkedlist);

	    mylinkedlist.add(0, "Canada"); // Add it to the beginning of the list
	    System.out.println("(2) " + mylinkedlist);

	    mylinkedlist.add("Russia"); // Add it to the end of the list
	    System.out.println("(3) " + mylinkedlist);

	    mylinkedlist.add("France"); // Add it to the end of the list
	    System.out.println("(4) " + mylinkedlist);

	    mylinkedlist.add(2, "Germany"); // Add it to the list at index 2
	    System.out.println("(5) " + mylinkedlist);

	    mylinkedlist.add(5, "Norway"); // Add it to the list at index 5
	    System.out.println("(6) " + mylinkedlist);

	// Remove elements from the list
		  mylinkedlist.remove("Canada"); // Same as list.remove(0) in this case
		  System.out.println("(7) " + mylinkedlist);

		  mylinkedlist.remove(2); // Remove the element at index 2
		  System.out.println("(8) " + mylinkedlist);

		  mylinkedlist.remove(mylinkedlist.size() - 1); // Remove the last element
		  System.out.print("(9) " + mylinkedlist + "\n(10) ");

		  for (String s: mylinkedlist)
			System.out.print(s.toUpperCase() + " ");
}

	}