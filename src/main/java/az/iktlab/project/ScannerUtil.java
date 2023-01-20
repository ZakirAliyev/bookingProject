package az.iktlab.project;

import java.util.Scanner;

public class ScannerUtil {

    private static final Scanner sc = new Scanner(System.in);

    public static Commands getCommand() {
        return Commands.valueOf(sc.nextLine().toUpperCase());
    }
}
