public class Bucket {
    private static int[] buckets = {1, 2, 5, 10};


    public static int getCountOfWays(int capacity) {
        return getCountOfWays(capacity, 3);
    }

    private static int getCountOfWays(int capacity, int indexOfBucket) {
        if ((capacity < 0 || indexOfBucket < 0)) {
            return 0;
        }
        if (indexOfBucket == 0) {
            return 1;
        }

        return getCountOfWays(capacity, indexOfBucket - 1) + getCountOfWays(capacity - buckets[indexOfBucket], indexOfBucket);
    }
}
