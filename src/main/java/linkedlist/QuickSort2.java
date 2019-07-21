package linkedlist;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class QuickSort2 {
	public static void main(String[] args) {

        System.out.println("Type LinkedList");

        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 50; i++) {
            int input=(int)(Math.random()*100)%100;
            System.out.print(String.format("%d ", input));
            list.add(input);
        }
        
        System.out.println("\nQuickSort by Memory");
        
		quickSort(list, 0, list.size() -1);
		for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        
        
        System.out.println("\nType LinkedList push to stack");
        LinkedList<Integer> list2 = new LinkedList<>();
        // ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(list);

        Stack<Integer> stack = new Stack<>();
        while (list2.size()>0) {
            int first=list2.removeFirst();
            
            stack.add(first);
            System.out.print(first + " ");
        }

        System.out.println("\nstack pop");
        while (stack.size()>0) {
            System.out.print(stack.pop() + " ");
        }

        System.out.println("\nType LinkedList to Queue");

        Queue<Integer> queue = new LinkedList<>();
        queue.addAll(list);
        
        while (queue.size()>0) {
            System.out.print(queue.poll() + " ");
        }
	}


	public static int partition(List<Integer> list, int begin, int end) {
		int pivot = list.get(begin);
		int i = begin;
		int j = end;
		while (i < j) {
			while (i < j && list.get(j) >= pivot)
				j--;
			while (i < j && list.get(i) <= pivot)
				i++;
			swap(list, i, j);
		}
		swap(list, begin, j); // pivot 중간에 넣기
		return j;

	}

	public static void quickSort(List<Integer> list, int begin, int end) {
		if (begin >= end)
			return;
		int mid = partition(list, begin, end);
		quickSort(list, begin, mid - 1);
		quickSort(list, mid + 1, end);
	}

	public static void swap(List<Integer> list, int i, int j) {
		int tmp = list.get(i);
		list.set(i,list.get(j));
		list.set(j,tmp);
	}
}
