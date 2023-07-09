package com.tandrita;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int studentnum = scan.nextInt();
        scan.nextLine();

      try {
          FileWriter writer = new FileWriter("Details.csv");

          for (int i = 0; i < studentnum; i++) {
              System.out.println("\nEnter the details of student" + (i + 1));

              System.out.println("Enter the Name: ");
              String Name = scan.nextLine();

              System.out.println("Enter the Id: ");
              int Id = scan.nextInt();
              scan.nextLine();

              System.out.println("Enter the emailID: ");
              String Email = scan.nextLine();

              String studentDetails = Name + "," + "," + Id + "," + "," + Email + "\n";
              writer.write(studentDetails);

          }
          writer.close();
          System.out.println("\n The Details of these students has been stored to Details.csv");
      } catch(IOException a) {
          System.out.println("an error has been occurred while saving.");
          a.printStackTrace();
      }
      scan.close();

      }

    }

