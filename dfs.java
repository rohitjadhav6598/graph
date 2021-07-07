//dfs
class Solution
{
	public void dfs(int node, boolean vis[], ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> storeDfs){
		storeDfs.add(node);
		vis[node] = true;
		for(Integer it:adj.get(node)){
			if(!vis[it]){
				dfs(it,vis,adj,storeDfs);
			}
		}
	}
	public ArrayList<Integer> dfsOfGraph(int V,ArrayList<ArrayList<Intger>> adj){
		ArrayList<Integer> storeDfs = new ArrayList<>();
		boolean vis[] = new boolean[V+1];
		for(int i=0;i<=V;i++){
			if(!vis[i]){
				dfs(i,vis,adj,storeDfs);
			}
		}
		return storeDfs;
	}
	
}