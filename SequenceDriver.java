public class SequenceDriver
{
   public static void main(String[] args)
   {
      Sequence firstSequence = new Sequence();
      firstSequence.add(1);
      firstSequence.add(4);
      firstSequence.add(9);
      firstSequence.add(16);
      System.out.println("First sequence: " + firstSequence);

      Sequence secondSequence = new Sequence();
      secondSequence.add(9);
      secondSequence.add(7);
      secondSequence.add(4);
      secondSequence.add(9);
      secondSequence.add(11);
      System.out.println("Second sequence: " + secondSequence);

      Sequence combinedSequence = firstSequence.append(secondSequence);
      System.out.println("Appended Sequence: "+ combinedSequence);
      System.out.println("Expected Sequence: [1, 4, 9, 16, 9, 7, 4, 9, 11]");
      System.out.println();

      /* -----------------------------------------
       * TESTS for Other methods to be implemented:
       * comment out as you progress in your work
      		
	System.out.println("First sequence: " + firstSequence);
      	System.out.println("Second sequence: " + secondSequence);
	Sequence mergedSequence = firstSequence.merge(secondSequence);
	System.out.println("Merged: "+ mergedSequence);
	System.out.println("Expected: [1, 9, 4, 7, 9, 4, 16, 9, 11]");
	System.out.println();

	* // add rest of Driver code
	* -----------------------------------------*/
   }
}
