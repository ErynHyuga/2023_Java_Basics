package at.kogler.structuredProgramming.exercise04;

public class main_loop_01 {
    public static void main(String[] args) {
        int k = 0;
        for (int i = 1; i < 101; i++) {
            k = i + k;
            System.out.println(k);
        }
    }
}
