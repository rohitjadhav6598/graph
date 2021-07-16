class Solution{
	public int[] topoBfs(int V, ArrayList<Arraylist<Integer>> adj){
		int Indegree[] = new int[V];
		
		for(int i=0;i<V;i++){
			for(Integer it:adj.get(i)) indegree[it]++;
		}
		Queue<Integer> q=new LinkedList<>();
		
		for(int i=0;i<V;i++){
			if(inDegree[i]==0) q.add(i);
		}
		int res[]=new int[V];
		int ind=0;
		while(!q.isEmpty()){
			int n=q.poll();
			res[ind++]=n;
			for(Integer it:adj.get(n)){
				inDegree[it]--;
				if(inDegree[it]==0) q.add(it);
			}
		}
		
		return res;
	}
}