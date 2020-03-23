import java.util.ArrayList;

public class Sequence
{
   private ArrayList<Integer> values;

   public Sequence()
   {
      values = new ArrayList<Integer>();
   }

   public void add(int n)
   {
      values.add(n);
   }

   public String toString()
   {
      return values.toString();
   }

   public Sequence append(Sequence other)
   {
      Sequence a = new Sequence();

      for (int value : this.values) 
      {
         a.add(value);
      }
      for (int value : other.values) 
      {
         a.add(value);
      }
         return a;
   }

   public Sequence merge(Sequence other) {

   ArrayList<Integer> list1 = this.values;

   ArrayList<Integer> list2 = other.values;

   Sequence s = new Sequence();

   if (list1.size() < list2.size()) 
   {
      int i = 0;

      for (i = 0; i < list1.size(); i++) 
      {

         s.add(list1.get(i));

         s.add(list2.get(i));

      }

      while(i<list2.size())
      {
         s.add(list2.get(i));
         i = i + 1;
      }
   }
   else if(list1.size()==list2.size())
   {
      int i = 0;

      for (i = 0; i < list1.size(); i++) 
      {

         s.add(list1.get(i));

         s.add(list2.get(i));

      }
   }
   else 
   {
      int i =0;

      for (i = 0; i < list2.size(); i++) 
      {

         s.add(list1.get(i));
         s.add(list2.get(i));
      }

      while(i<list1.size())
      {
         s.add(list1.get(i));
         i = i + 1;
      }
   }
   return s;
   }

   public Sequence mergeSorted(Sequence other)
   {
      Sequence combinedSequence = new Sequence();
      int i = 0;
      int j = 0;
      while ((i < values.size()) && (j < other.values.size()))
      {
         int firstValue = values.get(i);
         int secondValue = other.values.get(j);
         if (firstValue <= secondValue)
         {
            combinedSequence.add(firstValue);
            i++;
         }
         else
         {
            combinedSequence.add(secondValue);
            j++;
         }
      }
      if(i == values.size())
      {
         while(j < other.values.size())
         {
            combinedSequence.add(other.values.get(j));
            j++;
         }
      }
      else
      {
         while(i < values.size())
         {
            combinedSequence.add(values.get(i));
            i++;
         } 
      } 
      return combinedSequence;
   }

   public static void removeDuplicates(ArrayList<String> list) 
   {
      int index = 0;
      while (index < list.size() - 1) 
      {
         if (list.get(index).equals(list.get(index + 1))) 
         {
            list.remove(index + 1);
         } 
         else 
         {
            index++;
         }
      }
   }
}



