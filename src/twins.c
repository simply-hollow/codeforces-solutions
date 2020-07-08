#include<stdio.h>
#include<stdlib.h>
int  main(void){
	int i, n, *arr, sum=0, check, j, c=0, temp;
	scanf("%d", &n);
	arr=(int*)malloc(n*sizeof(int));
	for(i=0; i<n; i++){
		scanf("%d", &arr[i]);
		sum+=arr[i];
	}
	check=sum;
	sum=0;
	if(n>1){
		for(i=0;i<n; i++){
			for(j=0; j<n-1; j++){
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(i=n-1; i>=0; i--){
			check-=arr[i];
			sum+=arr[i];
			c++;
			if(check<sum)
				break;
		}	
	}
	else
		c++;
	printf("%d\n", c);
	return 0;
}