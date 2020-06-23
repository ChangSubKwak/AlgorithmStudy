package first;

// 최소 비용 신장 트리 만들기
// 1. 거리를 기준으로 간선을 오름차순 정렬
// 2. 정렬 순서에 따라 간선 선택
// 3. 간선 선택시 사이클이 되는 경우는 제외

import java.util.*;

public class Kruskal {
	public void unionParent(int[] parent, int node1, int node2) {
	  int p1 = getParent(parent, node1);
	  int p2 = getParent(parent, node2);

	  if (p1 > p2) parent[p1] = p2;
    else         parent[p2] = p1;
	}

	public int getParent(int[] parent, int e) {
	  if (parent[e] == e) return e;
    return getParent(parent, parent[e]);
  }

  public int isSameParent(int[] parent, int node1, int node2) {
	  int p1 = getParent(parent, node1);
	  int p2 = getParent(parent, node2);

	  if (p1 == p2) return 1;
    else          return 0;
	}

  public static void main(String[] args) {
    System.out.println("TEST");
    //Node[] nodeArray = new Node[11];
    ArrayList<Node> list = new ArrayList<Node>();

    list.add(new Node(1, 7, 12));
    /*
    nodeArray[1] = new Node(1, 4, 28);
    nodeArray[2] = new Node(1, 5, 67);
    nodeArray[3] = new Node(1, 2, 17);
    
    nodeArray[3] = new Node(1, 2, 17);
    nodeArray[3] = new Node(1, 2, 17);
    */
    /*
    nodeArray[4].n1 = 2; nodeArray[4].n2 = 4; nodeArray[4].cost = 24;
    nodeArray[5].n1 = 2; nodeArray[5].n2 = 5; nodeArray[5].cost = 62;

    nodeArray[6].n1 = 3; nodeArray[6].n2 = 5; nodeArray[6].cost = 20;
    nodeArray[7].n1 = 2; nodeArray[7].n2 = 5; nodeArray[7].cost = 37;

    nodeArray[8].n1 = 4; nodeArray[8].n2 = 7; nodeArray[8].cost = 13;

    nodeArray[9].n1 = 5; nodeArray[9].n2 = 6; nodeArray[9].cost = 45;
    nodeArray[10].n1 = 5; nodeArray[10].n2 = 7; nodeArray[10].cost = 73;
    */

    //*
    //for (int i = 0 ; i < nodeArray.length ; i++) {
    for (int i = 0 ; i < list.size(); i++) {
      System.out.println("[" + list.get(i).n1 + " -- " + list.get(i).n2 + " | " + list.get(i).cost + "]");
    }
    //*/

  }
}

class Node {
  public int n1;
  public int n2;
  public int cost;
  public Node(int n1, int n2, int cost) {
    this.n1 = n1;
    this.n2 = n2;
    this.cost = cost;
  }
}


