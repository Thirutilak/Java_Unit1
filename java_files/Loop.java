class Loop {
    public static void main(String[] args) {

        int i = 1;
        while (i <= 3) {
            System.out.println("While Loop: " + i);
            i++;
        }

        int j = 1;
        do {
            System.out.println("Do-While Loop: " + j);
            j++;
        } while (j <= 3);

        for (int k = 1; k <= 3; k++) {
            System.out.println("For Loop: " + k);
        }
    }
}
