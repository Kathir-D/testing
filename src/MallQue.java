import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
class MallQue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> queue = new PriorityQueue<>();
        int i = 1;

        System.out.println("Enter the names of the people in the queue (type exit to stop): ");
        String input = sc.nextLine();

        while (!input.equalsIgnoreCase("exit")) {
            queue.add(input);
            System.out.println("Enter the names of the people in the queue (type exit to stop): ");
            input = sc.nextLine();
        }

        System.out.println("Removing names of the people in the queue in this order: ");
        while (!queue.isEmpty()) {
            String name = queue.poll();
            int size = queue.size();
            System.out.println(i + ": " + name + " : , " + size + " people left in the queue.");
            queue.remove(name);
            i++;
        }
        if (queue.isEmpty()) {
            System.out.println("The queue is now empty.");
        } else {
            System.out.println("The queue is not empty.");
        }
    }
}
/*
Try to implement queue in a shopping mall. (FIFO)
Add the names..
Remove the names from the queue.
 */
