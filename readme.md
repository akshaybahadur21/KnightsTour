## Knight's Tour [![](https://img.shields.io/github/license/sourcerer-io/hall-of-fame.svg?colorB=ff0000)](https://github.com/akshaybahadur21/KnightsTour/blob/master/LICENSE.txt)  [![](https://img.shields.io/badge/Akshay-Bahadur-brightgreen.svg?colorB=ff0000)](https://akshaybahadur.com)
This code helps you to understand the Knight's tour problem

### Sourcerer
[![](https://sourcerer.io/fame/akshaybahadur21/akshaybahadur21/KnightsTour/images/0)](https://sourcerer.io/fame/akshaybahadur21/akshaybahadur21/KnightsTour/links/0)[![](https://sourcerer.io/fame/akshaybahadur21/akshaybahadur21/KnightsTour/images/1)](https://sourcerer.io/fame/akshaybahadur21/akshaybahadur21/KnightsTour/links/1)[![](https://sourcerer.io/fame/akshaybahadur21/akshaybahadur21/KnightsTour/images/2)](https://sourcerer.io/fame/akshaybahadur21/akshaybahadur21/KnightsTour/links/2)[![](https://sourcerer.io/fame/akshaybahadur21/akshaybahadur21/KnightsTour/images/3)](https://sourcerer.io/fame/akshaybahadur21/akshaybahadur21/KnightsTour/links/3)[![](https://sourcerer.io/fame/akshaybahadur21/akshaybahadur21/KnightsTour/images/4)](https://sourcerer.io/fame/akshaybahadur21/akshaybahadur21/KnightsTour/links/4)[![](https://sourcerer.io/fame/akshaybahadur21/akshaybahadur21/KnightsTour/images/5)](https://sourcerer.io/fame/akshaybahadur21/akshaybahadur21/KnightsTour/links/5)[![](https://sourcerer.io/fame/akshaybahadur21/akshaybahadur21/KnightsTour/images/6)](https://sourcerer.io/fame/akshaybahadur21/akshaybahadur21/KnightsTour/links/6)[![](https://sourcerer.io/fame/akshaybahadur21/akshaybahadur21/KnightsTour/images/7)](https://sourcerer.io/fame/akshaybahadur21/akshaybahadur21/KnightsTour/links/7)

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
