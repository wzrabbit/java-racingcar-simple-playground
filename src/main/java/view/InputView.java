package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    public static List<String> inputCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        final String rawCarNames = scanner.nextLine();

        return new ArrayList<>(Arrays.asList(rawCarNames.split(",")));
    }

    public static int inputRoundCount() {
        System.out.println("시도할 회수는 몇회인가요?");

        return scanner.nextInt();
    }
}
