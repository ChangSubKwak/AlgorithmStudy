package first;

// 1. 큐에서 하나의 노드 값을 꺼내기
// 2. 해당 노드에 연결된 노드 중 방문하지 않은 노드 방문 및 그 노드의 미 방문 노드 스택에 삽입
// 방문한 노드를 저장하는 스택, 미방문 노드 저장 큐 가 필요함

import java.util.*;

public class DFS {
	@SuppressWarnings("unchecked")
	public static LinkedList<Integer>[] list = new LinkedList[8]; // 그래프를 표현한 리스트
	public static boolean[] isVisit = new boolean[8];  // 방문여부 체크 배열
	
	public static void execute(int start) {
	  if (isVisit[start])
	    return;
	  isVisit[start] = true;

	  System.out.print(start + " ");
	  for(int i = 0 ; i < list[start].size() ; i++) {
	    int nextNode = list[start].get(i);
	    execute(nextNode);
    }
	}
	
	public static void main(String[] args) {
		//@SuppressWarnings("unchecked")	LinkedList<Integer>[] list = new LinkedList[8];
		for (int i = 0 ; i < 8 ; i++) 
			list[i] = new LinkedList<Integer>();
		
		list[1].add(2);		list[1].add(3);
		list[2].add(1);		list[2].add(3);		list[2].add(4);		list[2].add(5);
		list[3].add(1);		list[3].add(2);		list[3].add(6);		list[3].add(7);
		list[4].add(2);		list[4].add(5);
		list[5].add(2);		list[3].add(4);
		list[6].add(3);		list[6].add(7);
		list[7].add(3);		list[7].add(6);
		
		execute(1);
		System.out.println();
	}
}
