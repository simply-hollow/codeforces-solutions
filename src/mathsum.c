#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int main(void){
	int i, j, c=0, temp, count=0;
	char str[101], s[101];
	scanf("%s", s);
	for(i=0; i<strlen(s); i++)
	{
		if(s[i]=='+')
			continue;
		else{
			str[c]=s[i];
			c++;
		}
	}
	if(c>1){
		for(i=0; i<c; i++)
			for(j=0; j<c-1; j++)
				if(str[j]>str[j+1])
				{
					temp=str[j];
					str[j]=str[j+1];
					str[j+1]=temp;
				}
		for(i=0; i<strlen(s); i++){
			if(i%2!=0)
				s[i]='+';
			else{
				s[i]=str[count];
				count++;
			}
		}
	}
	printf("%s\n", s);
	return 0;
}