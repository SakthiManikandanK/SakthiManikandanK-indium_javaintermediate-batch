package collections.list;

import collections.Skill;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListQueueDemo {
    public static void main(String[] args) {
        // LinkedList implements queue and Stack
        Skill java = new Skill(1,"java",true);
        Skill nodeJs = new Skill(1,"nodeJs",true);
        Skill js = new Skill(1,"js",true);

        Queue<Skill> queue = new LinkedList<>();

        queue.offer(java);
        queue.offer(nodeJs);
        queue.offer(js);

        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);

    }

}
