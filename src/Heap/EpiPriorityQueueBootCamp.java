package Heap;

import java.text.Collator;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Iterator;

public class EpiPriorityQueueBootCamp {

	public static ArrayList<String> topK(int k, Iterator<String> it) {
		Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return Integer.compare(o1.length(), o2.length());
			}
		};
		
		PriorityQueue<String> minHeap = new PriorityQueue<String>(k, comparator);
		
		while (it.hasNext()) {
			minHeap.add(it.next());
			if (minHeap.size() > k) {
				minHeap.poll();
			}
		}
		
		return new ArrayList<>(minHeap);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
