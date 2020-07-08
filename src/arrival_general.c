#include<stdio.h>
#include<stdlib.h>
int main(void){
	int i, n, arr[100];
	scanf("%d", &n);
	for(i=0; i<n; i++)
	{
		scanf("%d", &arr[i]);
		if(i==0){
			min=arr[i];
			max=arr[i];
		}
		else{
			if(max>=arr[i])
				max=arr[i];
			if(min<=arr[i])
				min=arr[i];
		}
	}
}