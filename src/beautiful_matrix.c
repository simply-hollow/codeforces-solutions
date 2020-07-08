#include<stdio.h>
#include<stdlib.h>
int main(void)
{
	int i, j, arr[5][5], col, row;
	for(i=0; i<5; i++)
		for(j=0; j<5; j++){
			scanf("%d", &arr[i][j]);
			if(arr[i][j]==1){
				col=j+1;
				row=i+1;
			}
		}
	if(row>=3 && col>=3){
		row-=3;
		col-=3;
	}
	else if(row>=3 && col<3){
		row-=3;
		col=3-col;
	}
	else if(row<3 && col>=3){
		row=3-row;
		col-=3;
	}
	else{
		row=3-row;
		col=3-col;
	}
	printf("%d\n", row+col);
	return 0;
}