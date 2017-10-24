## NQueen Problem
This code helps you to understand the Knight's tour problem


### Code Requirements
The example code is in Java ([version 1.8](https://java.com/en/download/) or higher will work). 

### Description
A knight's tour is a sequence of moves of a knight on a chessboard such that the knight visits every square only once. If the knight ends on a square that is one knight's move from the beginning square (so that it could tour the board again immediately, following the same path), the tour is closed, otherwise it is open.

The knight's tour problem is the mathematical problem of finding a knight's tour. Creating a program to find a knight's tour is a common problem given to computer science students. Variations of the knight's tour problem involve chessboards of different sizes than the usual 8 × 8, as well as irregular (non-rectangular) boards.

For more information, [see](https://en.wikipedia.org/wiki/Knight%27s_tour)

<img src="https://github.com/akshaybahadur21/KnightsTour/blob/master/knightstour.gif">


```java

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
``` 

### Execution
To compile the code, simply run the `javac KnightTour.java`.
To run the code, type `java KnightTour`

```
javac KnightTour.java
java KnightTour
```
