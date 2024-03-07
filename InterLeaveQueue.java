import java.util.*;

public class InterLeaveQueue {
    static void interLeaveQueue(Queue<Integer> q) {
        if (q.size() % 2 != 0)
        System.out.println("Input even number of integers.");

        Stack<Integer> s = new Stack<>();
        int halfSize = q.size() / 2;

        for (int i = 0; i < halfSize; i++)
        s.push(q.poll());

        while (!s.empty())
        q.add(s.pop());

        for (int i = 0; i < halfSize; i++)
        q.add(q.poll());

        for (int i = 0; i < halfSize; i++)
        s.push(q.poll());

        while (!s.empty()) {
            q.add(s.pop());
            q.add(q.poll());
        }
    }

    public static void start() {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        interLeaveQueue(q);
        int length = q.size();
        for (int i = 0; i < length; i++)
        System.out.print(q.poll() + " ");
    }
}
