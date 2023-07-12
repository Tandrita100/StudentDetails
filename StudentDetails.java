package com.tandrita;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class StudentDetails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner File = new Scanner(System.in);
        Scanner idNum = new Scanner(System.in);
        Scanner Gmail = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int studentNum = scan.nextInt();
        System.out.println("Enter your file name with Extension");

      try {
          if (File.hasNextInt()) {
              System.out.println("Invalid input. String expected.");
              return;
          }
          String FileName = scan.nextLine();
          FileWriter writer = new FileWriter(File.nextLine());

          for (int i = 0; i < studentNum; i++) {
              System.out.println("\nEnter the details of student" + (i + 1));

              System.out.println("Enter the Name: ");
              String Name = scan.nextLine();

              System.out.println("Enter the Id: ");
              if (!idNum.hasNextInt()) {
                  System.out.println("Invalid input. Integer expected.");
                  return;
              }
              String Id = idNum.nextLine();

              System.out.println("Enter the emailID: ");
              String Email = Gmail.nextLine();
              if (!Email.endsWith("@gmail.com")) {
                  System.out.println("Invalid input. Email must end with '@gmail.com'.");
                  return;
              }

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

