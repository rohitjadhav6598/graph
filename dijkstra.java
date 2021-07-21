class Node implements Comparator<Node>{
	private int v;
	private int weight;
	Node(int _v, int _w){v=_v;weight=_w;}
	int getV(){return v;}
	int getWeight(){return weight;}
	@Override
	public int compare(Node node1, Node node2){
		if(node1.weight<node2.weight) return -1;
		if(node1.weight>node2.weight) return 1;
		return 0;
	}
}

class Main{
	public int[] dijkstra(int s, int N, ArrayList<ArrayList<Node>> adj){
		int dist[] = new int[N];
		PriorityQueue<Node> pq = new PriorityQueue<Node>(N,new Node());
		for(int i=0;i<N;i++)dist[i]=Integer.MAX_VALUE;
		Dist[s]=0;
		pq.add(new Node(s,0));
		while(pq.size>0){
			Node node = pq.poll();
			for(Node it : adj.get(node.getV())){
				if(dist[it.getV()]>dist[node.getV()]+it.getWeight()){
					dist[it.getV()]=dist[node.getV()]+it.getWeight();
					pq.add(new Node(it.getV(),dist[it.getV()]));
				}
			}
		}
		return dist;
	}

}