package com.java17students;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Scanner;

public class Program {


    public static void main(String[] args) {
        Student st = new Student(null,"Marian","Kowal","123");

        StudentDao studentDao = new StudentDao();
        studentDao.savesStudentsToDatabase(st);
        System.out.println(studentDao.getAllStudentFromDatabase());
        Scanner mojSkanner = new Scanner(System.in);



        System.out.println("podaj komende: ");

        do {

            System.out.println("Podaj imie");
            


        } while mojSkanner !="exit";
         // Or something like this, I don't know the code


            }

        }







