class Pair{
	private int val;
	private int weight;
	Pair(int _v, int _w){ val = _v; weight = _w;}
	int getV(){return val;}
	int getWeight(){return weight;}
}

class Solution{
	void topoSortUtil(int node, boolean vis[], Stack stack, ArrayList<ArrayList<Pair>> adj){
		vis[node]=true;
		for(Pair it : adj.get(node)){
			if(!vis[it.getV]){
				topoSortUtil(it.getV(),vis,stack,adj);
			}
		}
		stack.push(node);
	}
	
	int[] shortedPath(int n, ArrayList<ArrayList<Pair>> adj){
		Stack stack = new Stack();
		int dist[] = new int{n];
		Boolean vis = new Boolean[n];
		for(int i=0;i<n;i++) vis[i]=false;
		for(int i=0;i<n;i++){
			if(!vis[i]) topoSortUtil(i,vis,stack,adj);
		}
		for(int i=0;i<n;i++) dist[i]=Integer.MAX_VALUE;
		dist[o]=0;
		while(!stack.empty()){
			int node = (int) stack.pop();
			if(dist[node]!=Integer.MAX_VAL){
				for(Pair it:adj.get(node)){
					if(dist[it.getV()]>dist[node]+it+getWeight()) dist[it.getV()]=dist[node]+it+getWeight();
				}
			}
		}
		return dist;
		
	}
}