import java.util.Arrays;
import java.util.PriorityQueue;

public class MedianInSlidingWindow {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 8};
        int k = 3;
        double[] result = findMedians(array, k);

        System.out.println("Result array:");
        for (double median : result) {
            System.out.println(median);
        }
    }

    public static double[] findMedians(int[] nums, int k) {
        double[] result = new double[nums.length - k + 1];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        for (int i = 0; i < nums.length; i++) {
            addNumber(nums[i], minHeap, maxHeap);
            rebalance(minHeap, maxHeap);

            if (i - k + 1 >= 0) {
                if (minHeap.size() > maxHeap.size()) {
                    result[i - k + 1] = (double) minHeap.peek();
                } else {
                    result[i - k + 1] = (double) maxHeap.peek();
                }
                removeNumber(nums[i - k + 1], minHeap, maxHeap);
                rebalance(minHeap, maxHeap);
            }
        }

        return result;
    }

    private static void addNumber(int num, PriorityQueue<Integer> minHeap, PriorityQueue<Integer> maxHeap) {
        if (maxHeap.isEmpty() || num <= maxHeap.peek()) {
            maxHeap.add(num);
        } else {
            minHeap.add(num);
        }
    }

    private static void removeNumber(int num, PriorityQueue<Integer> minHeap, PriorityQueue<Integer> maxHeap) {
        if (num <= maxHeap.peek()) {
            maxHeap.remove(num);
        } else {
            minHeap.remove(num);
        }
    }

    private static void rebalance(PriorityQueue<Integer> minHeap, PriorityQueue<Integer> maxHeap) {
        if (maxHeap.size() > minHeap.size() + 1) {
            minHeap.add(maxHeap.poll());
        } else if (minHeap.size() > maxHeap.size()) {
            maxHeap.add(minHeap.poll());
        }
    }
}
