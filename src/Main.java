import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AccountRegister register = new AccountRegister();

        Scanner scanner = new Scanner(System.in);
        int choise = 0;

        while (choise != 5) {

            System.out.println("1. Öppna upp konto");
            System.out.println("2. Lista konton");
            System.out.println("3. Insättning");
            System.out.println("4. Uttag");
            System.out.println("5. Avsluta");
            System.out.println("Val: ");

            choise = scanner.nextInt();
            scanner.nextLine();

            if (choise == 1) {
                System.out.println("Ange namn ");
                String name = scanner.nextLine();
                System.out.println("Ange startsaldo ");
                int balance = scanner.nextInt();

                scanner.nextLine();
                register.createAccount(name, balance);
                System.out.println("Kontot har skapats");

            } else if (choise == 2) {
                register.printAll();




            } else if (choise == 3) {
                System.out.println("Namn ");
                String name = scanner.nextLine();
                Account found = register.findAccount(name);
                if (found != null) {
                    System.out.println("Belopp ");
                    int amount = scanner.nextInt();
                    scanner.nextLine();
                    found.deposit(amount);
                    System.out.println("Nytt saldo: " + found.getBalance());
                } else {
                    System.out.println("Kontot saknas " + name);



                }

            } else if (choise == 4) {
                System.out.println("Ange önskat belopp att ta ut");
                System.out.println("namn ");
                String name = scanner.nextLine();
                Account found = register.findAccount(name);
                if (found != null) {
                    System.out.println("Belopp ");
                    int amount = scanner.nextInt();
                    found.withdraw(amount);
                    System.out.println("Nytt saldo: " + found.getBalance());
                } else {
                    System.out.println("Kontot saknas " + name);


                }
            } else if (choise == 5) {
                System.out.println("Hej då");
            } else {
                System.out.println("Ogiltigt val");
            }

        }
    }
}