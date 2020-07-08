#include<stdio.h>
#include<string.h>
int main(void){
	int i, t;
	char str[101][101];
	printf("enter testcase: ");
	scanf("%d", &t);
	for(i=0; i<t; i++)
		scanf("%s", str[i]);
	for(i=0; i<t; i++){
		if(strlen(str[i])>10)
			printf("%c%ld%c\n",str[i][0],(strlen(str[i])-2),str[i][strlen(str[i])-1]);
		else
			printf("%s\n", str[i]);
	}
	return 0;
}