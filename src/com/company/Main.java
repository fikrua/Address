package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner keybord = new Scanner(System.in);
        System.out.println("enter your address");
        String address = keybord.nextLine();
        System.out.println("enter your house number");
        int houseNo = keybord.nextInt();
        System.out.println("enter your first name");
        String firstIntial = keybord.next();
        System.out.println("enter your city");
        String city = keybord.next();

        System.out.println(firstIntial+ " house number "+houseNo +" city "+ city);
        System.out.println(address);
	// write your code here
    }
}
