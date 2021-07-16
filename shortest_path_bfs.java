class Solution{
	public int[] shortestPath(int V, int src, ArrayList<ArrayList<Integer>> adj){
		int res[]=new int[V];
		for(int i=0;i<V;i++) res[i]=Integer.MAX_VALLUE;
		res[src]=0;
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(src);
		while(!q.isEmpty()){
			int n=q.poll();
			for(Integer it:adj.get(n)){
				if(res[n]+1<res[it]){
					q.add(it);
					res[it]=res[n]+1;
				}
			}
		}
		return res;
	}
}