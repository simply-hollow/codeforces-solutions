#include<stdio.h>
//#include<stdlib.h>
#include<string.h>
int main(void){
	//int i;
	char str1[101], str2[101];
	scanf("%s", str1);
	scanf("%s", str2);
	int i=strcasecmp(str1, str2);
	if(i==0)
		printf("0\n");
	else if(i>0)
		printf("1\n");
	else
		printf("-1\n");
	return 0;
}