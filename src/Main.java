import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter name and lastname");
        String name=scanner.nextLine();
        boolean isBlocked = false;
        for (BlackList blackList : BlackList.values()) {
            if (blackList.getList().contains(name)) {
                if (blackList == BlackList.TERRORISTS || blackList == BlackList.EXTREMISTS) {
                    System.out.println("The user is blocked");
                    isBlocked = true;
                    break;
                } else if (blackList == BlackList.MONEY_LAUNDERER) {
                    blackList.getList();
                    System.out.println("User added to watchlist");
                    break;
                }
            }
        }
        if (!isBlocked) {
            System.out.println("User not found in the blacklist");
        }
    }
}
