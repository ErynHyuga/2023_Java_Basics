package at.kogler.structuredProgramming.exercise05;

public class MainLoop02 {
    public static void main(String[] args) {
        int k = 0;
        for (int i = 2; i <= 1000; i = i + 2) {
            k = i + k;
            System.out.println(k);
        }
    }
}
