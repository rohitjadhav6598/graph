/*input
5 7 //n,m
1 2 //u1,v1
2 4
2 3
1 3
3 4
1 5
5 3
*/
//storing undirected graph in adj mx 
int main(){
	int n,m;//nodes,edges
	cin>>n>>m;
	int adj[n+1][n+1];//declare adj mx +1 cause of 1 based indexing
	for(int i=0;i<m;i++){
		int u,v;
		cin>>u>>v;
		adj[u][v]=1;
		adj[v][u]=1;
	}
	return 0;
}
//java
import  java.io.*;
class GFG{
	public  static void main(String[] args){
		int n = 3,m=3;
		int adj[][] = new int[n+1][n+1];
		//edge 1->2
		adj[1][2]=1;
		adj[2][1]=1;
		//edge 2->3
		adj[2][3]=1;
		adj[3][2]=1;
		
	}
}

//storing undirected graph in adj list
int main(){
	int n,m;//nodes,edges
	cin>>n>>m;
	vector<int> adj[n+1];//declare adj mx +1 cause of 1 based indexing
	for(int i=0;i<m;i++){
		int u,v;
		cin>>u>>v;
		adj[u].push_back(v);
		adj[v].push_back(u);//if it is directed graph omit this line
	}
	return 0;
}
//java
import java.io.*;
import java.util.*;
class GFG{
	public  static void main(String[] args){
		int n = 3,m=3;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
		
		for(int i=0;i<=n;i++)
			adj.add(new ArrayList<Integer>());
		//edge 1->2
		adj.get(1).add(2);
		adj.get(2).add(1);
		//edge 2->3
		adj.get(2).add(3);
		adj.get(3).add(2);
		
		for(int i=1;i<n;i++){
			for(int j=0;j<adj.get(i).size();j++){
				System.out.print(adj.get(i).get(j)+" ");
			}
			System.out.println();
		}
		
	}
}

//for weighted graph use vector<pair<int,int>> adj[n+1]
// adj[u].pushback({v,wt});


