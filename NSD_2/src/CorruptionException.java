public class CorruptionException {

    private int Exception = 0;
    public int checkNum(int c) {

        if (c > 100) {
            System.out.println("EXCEPTION - Corrupt rainfall data has been inputted!");
            System.out.println("          - This data will ve disregarded!\n");
            Exception = 1;
        }

        return Exception;
    }

    public void reset() {
        Exception = 0;
    }
}
