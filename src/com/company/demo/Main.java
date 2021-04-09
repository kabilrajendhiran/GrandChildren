package com.company.demo;

import java.util.Scanner;

public class Main {

    //Grand Children

    public static void main(String[] args) {
	    String arr[][] ={{"Lava","Rama"},{"Kusha","Rama"},{"Rama","Dasarathan"},{"Lakshman",
                "Dasarathan"},
                {"Angad","Lakshman"},{"Dharamketu","Lakshman"},{"Abhisek","Amitabh"},{"Aaradhya","Abhisek"}
	    };



        System.out.println("Enter the name");

        Scanner scanner1 = new Scanner(System.in);
	    String name = scanner1.next();
	    String name2= "";

	    int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i][1].equals(name))
            {
                name2 = arr[i][0];

                for (int j = 0; j < arr.length; j++) {
                    if(arr[j][1].equals(name2))
                    {
                        count++;
                    }
                }


            }
        }
        System.out.println(count);

    }
}
