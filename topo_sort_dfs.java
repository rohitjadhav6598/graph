class Solution{
	public void topo(int node, boolean vis[], Stack<int> st, ArrayList<ArrayList<int>> adj){
		vis[node]=true;
		for(Integer it:adj.get(node)){
			if(!vis[it]) topo(it,vis,st,adj);
		}
		st.push(node);
	}
	
	public int[] topoSort(int V, ArrayList<ArrayList<int>> adj){
		boolean vis[] = new boolean[V];
		Stack<Stack> st = new Stack<Integer>();
		for(int i=0;i<V;i++){
			if(!vis[i]) topo(i,vis,st,adj)
		}
		int res[]=new int[V];
		int ind=0;
		while(!st.IsEmpty())res[ind++]=st.pop();
		return res;
	}
}