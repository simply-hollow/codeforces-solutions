#include<stdlib.h>
#include<stdio.h>
int main(void){
	int n, *arr1, *arr2, i;
	scanf("%d", &n);
	arr2=(int*)malloc(n*sizeof(int));
	arr1=(int*)malloc(n*sizeof(int));
	for(i=0; i<n; i++)
		scanf("%d", &arr1[i]);
	for(i=0; i<n; i++)
		arr2[arr1[i]-1]=i+1;
	for(i=0; i<n; i++)
		printf("%d ", arr2[i]);
	printf("\n");
	return 0;
}