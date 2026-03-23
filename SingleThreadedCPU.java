import java.util.*;

public class SingleThreadedCPU {

    public static int[] getOrder(int[][] tasks) {
        int n = tasks.length;

        // Add index
        int[][] indexedTasks = new int[n][3];
        for (int i = 0; i < n; i++) {
            indexedTasks[i][0] = tasks[i][0];
            indexedTasks[i][1] = tasks[i][1];
            indexedTasks[i][2] = i;
        }

        // Sort by enqueue time
        Arrays.sort(indexedTasks, (a, b) -> a[0] - b[0]);

        // Min heap: processing time, then index
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> a[1] == b[1] ? a[2] - b[2] : a[1] - b[1]
        );

        int[] result = new int[n];
        int i = 0, idx = 0;
        long time = 0;

        while (i < n || !pq.isEmpty()) {

            // Jump time if CPU idle
            if (pq.isEmpty() && time < indexedTasks[i][0]) {
                time = indexedTasks[i][0];
            }

            // Add available tasks
            while (i < n && indexedTasks[i][0] <= time) {
                pq.offer(indexedTasks[i]);
                i++;
            }

            // Process next task
            int[] curr = pq.poll();
            time += curr[1];
            result[idx++] = curr[2];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] tasks = new int[n][2];

        for (int i = 0; i < n; i++) {
            tasks[i][0] = sc.nextInt();
            tasks[i][1] = sc.nextInt();
        }

        int[] result = getOrder(tasks);

        for (int x : result) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}