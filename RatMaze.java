
public class RatMaze {
	
	static int p=0;
	
	public static int isPath(int [][] grid)
	{
		 int size = grid.length;
		  	  
		  int [][] edge = new int[size][size];
		  
		  int path=  solve(grid, edge, 0,0);
		  	
		  if(path==1)  
		  return 1;
		  
		  else
			  return 0;
	}
 
 
 static int solve(int [][] arr, int [][] edge, int x, int y)
 {
	 	
	 	int Size=arr.length;  //dik size  ;)
	 
	 	if(p==0)
	 	{
	 	
		 if(!(arr[x][y]==9))
	 
	 	{ 
	 		if(arr[x][y]==1)// if legal move keep continuing nigga
	 		{
	 			edge[x][y]=1;  //mark this position as visited
	 			
	 			
	 			 // downward 
	 			
	 			 { x++; if(x<Size && x>-1 )
	 								{if (arr[x][y]!=0 && edge[x][y]==0)  //if dis nigga dont visited den 
	 									solve(arr,edge, x, y); 
	 								else {
	 								
	 									if(arr[x][y]==0)
	 										edge[x][y]=2;
	 								x--;}
	 								}
	 							else
	 							{
	 								x--;
	 							}
	 			
	 			} 		
	 					
	 		//upward
	 					{ 
	 				x--;
	 				
	 					if(x<Size && x>-1 )
	 						
							{
	 						if (arr[x][y]!=0 && edge[x][y]==0)
								solve(arr,edge, x, y); 
							else {
								if(arr[x][y]==0)
									edge[x][y]=2;
										x++;
								}
							}
						else
						{
							x++;
						}
		
		} 

	 					
	 			  //right
	 					{ y++; 
	 					if(y<Size && y>-1 )
							{if (arr[x][y]!=0 && edge[x][y]==0)
							solve(arr,edge, x, y); 
							else {
								if(arr[x][y]==0)
							edge[x][y]=2;
							y--;}
							}
						else
						{
							y--;
						}
		
		} 
	 					
	 				
	 			  //left
	 					{ y--; 
	 					if(y<Size && y>-1 )
							{if (arr[x][y]!=0 && edge[x][y]==0)
							solve(arr,edge, x, y); 
							else {
								if(arr[x][y]==0)
							edge[x][y]=2;
							y++;}
							}
						else
						{
							y++;
						}
		
		}
	 					
	 					//return 0;
 				
	 			}
	 		
	 		else
	 			return 0;
	 			
	 			
	 			
	 		}
	
	if(arr[x][y]==9) 
		p=1;
	 
	 	}
	 	
	 return p;
 
 
}
 
 
 public static void main(String args[])
 {
	// int [][] grid= {{1,0,1,0},{1,0,1,0},{1,0,1,0},{1,1,1,0}};
	 
       //int [][] grid= {{1,1,1},{1,1,1},{0,1,0}};
   int [][] grid= {{1,1,0},{9,1,1},{0,1,1}};
	 
	// int [][] grid= {{1,0,1,1,1,0,0,1},{1,0,0,0,1,1,1,1},{1,0,0,0,0,0,0,0},{1,0,1,0,9,0,1,1}, {1,1,1,0,1,0,0,1}, {1,0,1,0,1,1,0,1},{1,0,0,0,0,1,0,1},{1,1,1,1,1,1,1,1}};
	 
	
	 
	 System.out.println(isPath(grid));
 }
	
	
	

}
