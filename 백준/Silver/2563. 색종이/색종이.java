import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int coloredPaperNum = sc.nextInt();
        int[][] paper = new int[101][101];

        for (int i = 0; i < coloredPaperNum; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int l = 0; l < 10; l++) {
                for (int j = 0; j < 10; j++) {
                    paper[y + j][x + l] += 1;
                }
            }
        }

        int cnt = 0;
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 100; j++) {
                if (paper[i][j] >= 1) {
                    cnt += 1;
                }
            }
        }

        System.out.println(cnt);
    }
}