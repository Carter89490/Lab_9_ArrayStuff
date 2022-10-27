import java.util.Random;
import java.util.Scanner;
public class Main {
    public static double getAverage(int vaules[]) {
        int sum = 0;
        double ave = 0;
        int[] Vals = new int[100];
        Random gen = new Random();
        for (int i = 0; i < Vals.length; i++) {
            Vals[i] = gen.nextInt(100) + 1;
            sum += Vals[i];
            ave = sum / Vals.length;
        }
        return ave;
    }


    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);
        int num1 = SafeInput.getRangedInt(pipe, "Enter a Number", 1, 100);
        int numtimes = 0;
        int num2 = SafeInput.getRangedInt(pipe, "Enter a Number", 1, 100);
        ;
        int sum = 0;
        double ave = 0;
        int min = 0;
        int max = 0;
        int[] dataPoints = new int[100];
        Random gen = new Random();

        for (int i = 0; i < dataPoints.length; i++)
            dataPoints[i] = gen.nextInt(100) + 1;

        for (int i = 0; i < dataPoints.length; i++)
            System.out.print(dataPoints[i] + " ");

        for (int i = 0; i < dataPoints.length; i++)
            sum += dataPoints[i];
        System.out.println("\nThe Sum is " + sum);

        ave = (double) sum / dataPoints.length;
        System.out.println("The Average is " + ave);

        for (int i = 0; i < dataPoints.length; i++)
            if (min > dataPoints[i])
                min = dataPoints[i];
        System.out.println("The Min is " + min);

        for (int i = 0; i < dataPoints.length; i++)
            if (max < dataPoints[i])
                max = dataPoints[i];
        System.out.println("The Max is " + max);


        for (int i = 0; i < dataPoints.length; i++) {
            if (num1 == dataPoints[i])
                numtimes++;
        }
        System.out.println("Your number aperars " + numtimes + " times");

        System.out.println("The average of dataPoints is " + getAverage(dataPoints));

        for (int i = 0; i < dataPoints.length; i++) {
            if (num2 == dataPoints[i])
                System.out.println(dataPoints[i]);
            break;
        }
    }
}