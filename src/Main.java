import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean check = true;
        int[] code = new int[4];
        while (check) {
            for (int i = 0; i < 4; i++) {
                Random random = new Random();
                int num = random.nextInt(1, 7);
                code[i] = num;
            }
            if (code[0] != code[1] && code[0] != code[2] && code[0] != code[3] && code[1] != code[0] && code[1] != code[2] && code[1] != code[3] && code[2] != code[0] && code[2] != code[1] && code[2] != code[3] && code[3] != code[0] && code[3] != code[1] && code[3] != code[2]) {
                check = false;
            }
        }
        System.out.println();
        System.out.println("For an easy game press 1\n For a regular game press 2\n For a hard game press 3\n For a surprising game press 4");
        Scanner scanner = new Scanner(System.in);
        int level = scanner.nextInt();
        int[] codeUser = new int[4];
        if (level == 1) {
            int count = 20;
            while (count > 0) {
                for (int i = 0; i < codeUser.length; i++) {
                    System.out.println("choose number" + (i + 1));
                    codeUser[i] = scanner.nextInt();
                }
                if (code[0] == codeUser[0] && code[1] == codeUser[1] && code[2] == codeUser[2] && code[3] == codeUser[3]) {
                    System.out.println("you won");
                    break;
                } else {
                    for (int i = 0; i < code.length; i++) {
                        for (int j = 0; j < codeUser.length; j++) {
                            if (code[i] == codeUser[i]) {
                                System.out.println(codeUser[i] + "correct");
                                break;
                            } else if (codeUser[j] == code[i]) {
                                System.out.println(codeUser[j] + " partially correct");
                                break;
                            }
                        }

                    }
                }
                count--;
                System.out.println(count + " guesses left");
            }
        }
        if (level == 2) {
            int count = 15;
            while (count > 0) {
                for (int i = 0; i < codeUser.length; i++) {
                    System.out.println("choose a number" + (i + 1));
                    codeUser[i] = scanner.nextInt();
                }
                if (code[0] == codeUser[0] && code[1] == codeUser[1] && code[2] == codeUser[2] && code[3] == codeUser[3]) {
                    System.out.println("you won");
                    break;
                } else {
                    for (int i = 0; i < code.length; i++) {
                        for (int j = 0; j < codeUser.length; j++) {
                            if (code[i] == codeUser[i]) {
                                System.out.println(codeUser[i] + "correct");
                                break;
                            } else if (codeUser[j] == code[i]) {
                                System.out.println(codeUser[j] + " partially correct ");
                                break;
                            }
                        }

                    }
                }
                count--;
                System.out.println(count + " guesses left");
            }

        }
    }
}
