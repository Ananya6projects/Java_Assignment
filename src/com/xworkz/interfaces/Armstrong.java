package com.xworkz.interfaces;

public class Armstrong {
        public static void main(String[] args) {
            int number = 370;
            int originalNumber = number;
            int result = 0;
            int digits = 0;

            int temp = number;
            while (temp != 0) {
                temp /= 10;
                digits++;
            }

            temp = number;


            while (temp != 0) {
                int remainder = temp % 10;
                result += Math.pow(remainder, digits);
                temp /= 10;
            }


            if (result == originalNumber) {
                System.out.println(originalNumber + " is an Armstrong number.");
            } else {
                System.out.println(originalNumber + " is not an Armstrong number.");
            }
        }
    }






