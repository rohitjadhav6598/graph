class Node{
	int first;
	int second;
	public Node(int first, int second){
		
	}
}

class Solution{
	static boolean checkForCycle(ArrayList<Arraylist<Integer>> adj,int s,boolean vis[]){
		Queue<Node> q = new LinkedList<>();
		q.add(new Node(s,-1));
		vis[s] = true;
		while(q.isEmpty()){
			int node = q.peak().first;
			int par = q.peak().second;
			q.remove();
			for(Integer it:adj.get(node)){
				if(vis[it] == false){
					q.add(new Node(it,node));
					vis[it]=true;
				}
				else if(par != it) return true;
			}
		}
		return false;
	}
	public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj){
		boolean vis[] = new boolean[V+1];
		Array.fill(vis,false);
		
		for(int i=1;i<=V;i++)
			if(vis[i]==false)
				if(checkForCycle(adj, i, vis))
					return true;
		return false;
	}
}