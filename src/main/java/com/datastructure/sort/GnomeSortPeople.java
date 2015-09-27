package com.datastructure.sort;

import java.io.*;
import java.util.*;


public class GnomeSortPeople  
{
   
   public static void main(String[] args) throws Exception
   {
      List<Person> people = new ArrayList<Person>();

      if (args.length != 2)
      {
         System.out.println("Usage: GnomeSortPeople <input file> <output file>");
         System.exit(1);
      }
      String inputFileName = args[0];
      String outputFileName = args[1]; 

      loadData(inputFileName, people);

      Person.resetCounter();
      long start = System.currentTimeMillis();
     // Sorter.gnomeSort(people);
      //Sorter.selectionSort(people);
    // Sorter.insertionSort(people);
      Sorter.bubbleSort(people);
      long end = System.currentTimeMillis();
      System.out.println(" the duration of sorting: " + (end - start));
      System.out.println("There were " + Person.getCounter() +
                         " comparisons to sort " + people.size() + 
                         " people with Gnome Sort");

      writeData(outputFileName, people);
   } 
   
   public static void loadData(String fileName, List<Person> people) 
                      throws IOException
   {
      File inStream = new File( fileName );
      Scanner reader = new Scanner( inStream );
      
      String name = "";
      String address = "";
      String suburb = "";
      String state = "";
      String temp = "";
      String firstName = "";
      int postCode = 0;
      
      boolean more = false;
      if( reader.hasNext() )
      {
         more = true;
      }
      
      while( more )
      {
         name = reader.nextLine();
         String [ ] tokens = name.split(",");
         
         name = tokens[0];
         firstName = tokens[1];
         
         address = reader.nextLine();

         temp = reader.nextLine();
         
         String [ ] st = temp.split("\\t");
         
         suburb = st[0];
         
         state = st[1];
         
         postCode = Integer.parseInt(st[2]);
         
         people.add(new Person(firstName, name, address, suburb, 
                              state, postCode));
         
         try
         {
              reader.nextLine();
         }
         catch( NoSuchElementException nsee )
         {
              more = false;
         }
      }
      
      reader.close();
   }
   
   public static void writeData(String fileName, List<Person> people) 
                      throws IOException
   {
      PrintWriter outFile = new PrintWriter(new File(fileName));
      
      for (Person p: people)
      {
         outFile.println(p);
      }
      
      outFile.close();
   }
}
