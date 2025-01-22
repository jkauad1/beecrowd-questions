package beecrowd_beginner;

import java.util.Scanner;

public class Month {

    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);

        int option = reader.nextInt();
        String month = "";

        if (option == 1){
            month = "January";
        } else if (option == 2){
            month = "February";
        } else if (option == 3) {
            month = "March";
        } else if (option == 4) {
            month = "April";
        } else if (option == 5) {
            month = "May";
        } else if (option == 6) {
            month = "June";
        } else if (option == 7) {
            month = "July";
        } else if (option == 8) {
            month = "August";
        } else if (option == 9) {
            month = "September";
        } else if (option == 10) {
            month = "October";
        } else if (option == 11) {
            month = "November";
        } else if (option == 12) {
            month = "December";
        }

        System.out.printf("%s", month);

    }
}
