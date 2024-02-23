package QUEUE;

import java.util.PriorityQueue;
import java.util.Queue;


public class QueueDemo {

	public static void main(String[] args) {
		Queue<CandidateDetails> queue  = new PriorityQueue<CandidateDetails>();
		queue.add(new CandidateDetails("Shubham", 1));
		queue.add(new CandidateDetails("Rajat", 4));
		queue.add(new CandidateDetails("Mahima", 3));
		while (queue.size()>0) {
			System.out.println(queue.poll());
			System.out.println("Hi");
		}

	}

}
