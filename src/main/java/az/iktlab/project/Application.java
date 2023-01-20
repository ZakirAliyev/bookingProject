package az.iktlab.project;

public class Application {

    public static boolean flag = true;

    public static void run() {

        while (flag) {
            showCommands();
            Commands commands = ScannerUtil.getCommand();
            switch (commands) {
                case OB:
                    Menu.onlineBoard();
                    break;
                case SHF:
                    Menu.showFlightInfo();
                    break;
                case SBF:
                    Menu.searchBook();
                    break;
                case CB:
                    Menu.cancelBooking();
                    break;
                case MF:
                    Menu.myFlight();
                    break;
                case EXIT:
                    flag = false;
                    break;
                default:
                    break;
            }
        }
    }

    private static void showCommands() {
        System.out.print("\nCommands: \n\n" +
                "1. (ob)   -> " + Commands.OB.getDescription() + "\n" +
                "2. (shf)  -> " + Commands.SHF.getDescription() + "\n" +
                "3. (sbf)  -> " + Commands.SBF.getDescription() + "\n" +
                "4. (cb)   -> " + Commands.CB.getDescription() + "\n" +
                "4. (mf)   -> " + Commands.MF.getDescription() + "\n" +
                "4. (exit) -> " + Commands.EXIT.getDescription() + "\n\n" +
                "Enter command : ");
    }
}
