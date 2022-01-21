import java.util.Scanner;

class MessageHolder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type end to exit");

        String[] lines = new String[10];
        int historySize = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                System.exit(0);
            }

            if (historySize == 10) {
                for (int i = 0; i < 9; i++) {
                    lines[i] = lines[i + 1];
                }
                lines[9] = input;
            } else {
                lines[historySize++] = input;
            }


            for (int i = 0; i < historySize; i++) {
                System.out.println("[" + (i + 1) + "] " + lines[i]);
            }
        }
    }
}

