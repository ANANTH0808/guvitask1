package task1;

public class Que6 {

	public static void main(String[] args) {
        int i, j, k;
        for (i = 5; i >= 1; i--) {
            for (j = 5; j > i; j--) {
                System.out.print(j);
            }
            for (k = i; k >= 1; k--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
	}


