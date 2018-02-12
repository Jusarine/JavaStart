package lesson6_Homework.task1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Tania on 30.01.2016.
 */
// ¬вести с консоли дату. —равнить ее с текущей датой в системе. ¬ывести отличающиес€ части (год, мес€ц) на экран.
public class Solution {
    public static void main(String[] args) throws ParseException {
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        String s = sdf.format(date);
        Date sd = sdf.parse(s);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your date in format dd.MM.yyyy :");
        String n = sc.nextLine();
        Date ud = sdf.parse(n);

        if (ud.before(sd)) System.out.println("Your date is before than system date.");
        else System.out.println("Your date is after than system date.");

    }
}
