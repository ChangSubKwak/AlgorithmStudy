package javalang;

// 부모를 작은 값으로 세팅
// 두 부모를 확인하여 같은 집합에 속하는지 확인

public class UnionFind {
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
	    //int[] parent = { 1, 2, 3, 4, 5, 6, 7, 8 }; 
        int[] parent = new int [9];
        for (int i = 1 ; i < parent.length ; i++)
            parent[i] = i;
    
        UnionFind uf = new UnionFind();
        uf.unionParent(parent, 1, 2);
        uf.unionParent(parent, 2, 3);
        uf.unionParent(parent, 3, 4);
        uf.unionParent(parent, 5, 6);
        uf.unionParent(parent, 6, 7);
        uf.unionParent(parent, 7, 8);

        for (int i = 1 ; i < parent.length ; i++)
            System.out.println(uf.getParent(parent, i));
        System.out.println("=======================");
        System.out.println(uf.isSameParent(parent, 1, 4));
        System.out.println(uf.isSameParent(parent, 2, 3));
        System.out.println(uf.isSameParent(parent, 1, 5));
    }
}

