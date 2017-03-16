import java.lang.*;
import java.io.*;
class KnightTour
{
	static int n;
	public static void main(String args[])throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter n");
		n=Integer.parseInt(br.readLine());
		int sol[][]=new int [n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				sol[i][j]=-1;
			}
		}
		solveTour(sol);
		
	}
	public static int isSafe(int x,int y,int sol[][])
	{
		if(x>=0&&x<n&&y>=0&&y<n&&sol[x][y]==-1)
			return 1;
		else
			return -1;
	}
	public static void solveTour(int sol[][])
	{
		sol[0][0]=0;	//starting point
		int xMove[] = {2, 1, -1, -2, -2, -1, 1, 2};
        int yMove[] = {1, 2, 2, 1, -1, -2, -2, -1};
		if(solveTourNextMove(0,0,1,sol,xMove,yMove)==1)
		{
			System.out.println();
			for(int i=0;i<n;i++)
			{
			for(int j=0;j<n;j++)
				{
					System.out.print(sol[i][j]+"\t");
				}
			System.out.println();
			}
			
		}
		else
		System.out.println("Solution doesn't exist");
	}
	public static int solveTourNextMove(int x,int y, int count,int sol[][], int xMove[],int yMove[])
	{
		if (count == n*n)
            return 1;
		int x1,y1;
		for(int i=0;i<8;i++)//8 for 8 moves of a knight
		{
			x1=x+xMove[i];
			y1=y+yMove[i];
			if(isSafe(x1,y1,sol)==1)
			{
				sol[x1][y1]=count;
				if(solveTourNextMove(x1,y1,count+1,sol,xMove,yMove)==1)
					return 1;
				sol[x1][y1]=-1;
									
			}
			
		}
		return -1;
	}
}