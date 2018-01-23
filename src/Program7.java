/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bo0947926
 */
import java.util.Scanner;
public class Program7 {
        public static void main(String[] args) {
            int arrayAmt;
            Scanner input = new Scanner(System.in);
            System.out.println("How many numbers do you want?");
            arrayAmt = input.nextInt();
            int[] nums = new int[arrayAmt];
            fillArray(nums);
            double avg = average(nums);
            System.out.println("The average of the numbers is: " + avg);
            
        }
        public static void fillArray (int[] nums){
        Scanner input = new Scanner(System.in);
            for (int y = 0; y < nums.length; y++)
            {
                System.out.println("What number would you like?");
                nums[y] = input.nextInt();
            }
        }
        public static double average (int[] x){
            int sum = 0; double avg;
            for (int y = 0; y < x.length; y++)
            {
                sum += x[y];
            }
            avg = (double)sum/(x.length);
            return avg;
        }
        }

