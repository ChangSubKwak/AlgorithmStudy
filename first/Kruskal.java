package first;

//최소 비용 신장 트리 만들기
//1. 거리를 기준으로 간선을 오름차순 정렬
//2. 정렬 순서에 따라 간선 선택
//3. 간선 선택시 사이클이 되는 경우는 제외

import java.util.*;

public class Kruskal {
	public void unionParent(int[] parent, int node1, int node2) {
		int p1 = getParent(parent, node1);
		int p2 = getParent(parent, node2);

		if (p1 > p2)
			parent[p1] = p2;
		else
			parent[p2] = p1;
	}

	public int getParent(int[] parent, int e) {
		if (parent[e] == e)
			return e;
		return getParent(parent, parent[e]);
	}

	public int isSameParent(int[] parent, int node1, int node2) {
		int p1 = getParent(parent, node1);
		int p2 = getParent(parent, node2);

		if (p1 == p2)
			return 1;
		else
			return 0;
	}

	public static void main(String[] args) {
		ArrayList<Node> list = new ArrayList<Node>();

		list.add(new Node(1, 7, 12));
		list.add(new Node(1, 4, 28));
		list.add(new Node(1, 2, 67));
		list.add(new Node(1, 5, 17));

		list.add(new Node(2, 4, 24));
		list.add(new Node(2, 5, 62));

		list.add(new Node(3, 5, 20));
		list.add(new Node(3, 6, 37));

		list.add(new Node(4, 7, 13));

		list.add(new Node(5, 6, 45));
		list.add(new Node(5, 7, 73));

		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);


		int parent[] = new int[8];
		for (int i = 0 ; i < parent.length ; i++)
			parent[i] = i;

		int sum = 0;
		Kruskal k = new Kruskal();
		for (int i = 0 ; i < list.size() ; i++) {
			if (k.isSameParent(parent, list.get(i).n1, list.get(i).n2) == 0) {
				k.unionParent(parent, list.get(i).n1, list.get(i).n2);
				sum += list.get(i).cost;
			}
		}
		System.out.println(sum);

		/*
		for (int i = 0; i < list.size(); i++) {
			System.out.println("[" + list.get(i).n1 + " -- " + list.get(i).n2 + " | " + list.get(i).cost + "]");
		}
		//*/

	}
}

class Node implements Comparable<Node> {
	public int n1;
	public int n2;
	public int cost;

	public Node(int n1, int n2, int cost) {
		this.n1 = n1;
		this.n2 = n2;
		this.cost = cost;
	}

	@Override
	public int compareTo(Node node) {
		return this.cost - node.cost;
	}

	public String toString() {
		return "[" + this.n1 + ", " + this.n2 + ", " + this.cost + "]";
	}
}

